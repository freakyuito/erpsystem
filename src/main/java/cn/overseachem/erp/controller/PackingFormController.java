package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.PackingFormDataItem;
import cn.overseachem.erp.pojo.PackingFormDtlGrid;
import cn.overseachem.erp.pojo.PurchaseOrderSpec;
import cn.overseachem.erp.service.ColorService;
import cn.overseachem.erp.service.PackingFormService;
import cn.overseachem.erp.service.ProductOrderService;
import cn.overseachem.erp.service.PurchaseOrderService;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/22.
 */

@Controller
@RequestMapping("/product/packing_form")
public class PackingFormController {

    @Autowired
    private PackingFormService packingFormService;
    @Autowired
    private ProductOrderService productOrderService;
    @Autowired
    private PurchaseOrderService purchaseOrderService;
    @Autowired
    private ColorService colorService;

    @RequestMapping("/2dtl")
    public String detailPage(String batchNum, Model model) {
        PackingFormDtlGrid grid = new PackingFormDtlGrid();
        PurchaseOrderSpec purchaseOrderSpec = purchaseOrderService.getSpecById(productOrderService.getPurchaseSpecIdByBatchNum(batchNum));
        String purchaseNum = purchaseOrderSpec.getFkPurchaseNum();
        String colorName = colorService.getNameById(purchaseOrderSpec.getColorId());
        String size = "" + purchaseOrderSpec.getLength() + "*" + purchaseOrderSpec.getWidth() + "*" + purchaseOrderSpec.getThickness();
        String packingNum = packingFormService.getPackingNumByBatchNum(batchNum);
        grid.setBatchNum(batchNum);
        grid.setColorName(colorName);
        grid.setPackingNum(packingNum);
        grid.setPurchaseNum(purchaseNum);
        grid.setSize(size);
        model.addAttribute("packingFormDtlGrid", grid);
        return "/product/plate/packing_form/dtl";
    }

    @RequestMapping("/get_weighing_list")
    @ResponseBody
    public List<PackingFormDataItem> getWeighingList(String packingNum) {
        ArrayList<PackingFormDataItem> arrayList = new ArrayList<PackingFormDataItem>();
        JsonArray jsonArray = new JsonParser().parse(packingFormService.getWeighingList(packingNum)).getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); i++) {
            arrayList.add(new PackingFormDataItem(jsonArray.get(i).getAsJsonObject().get("index").getAsString(), jsonArray.get(i).getAsJsonObject().get("key").getAsString(),
                    jsonArray.get(i).getAsJsonObject().get("value").getAsString()));
        }
        return arrayList;
    }

    @RequestMapping("/set_weighing_data")
    @ResponseBody
    public void setWeighingData(String packingNum, String index, String quantity, String weight) {
        packingFormService.setWeighingData(packingNum, index, quantity, weight);
    }

    @RequestMapping("/generate_weighing_list")
    @ResponseBody
    public void generateWeighingList(String batchNum, String bundleNum) {
        String packingNum = packingFormService.getPackingNumByBatchNum(batchNum);
        Integer purchaseSpecId = productOrderService.getPurchaseSpecRequiredAmountByBatchNum(batchNum);
        Integer requiredAmount = purchaseOrderService.getSpecById(purchaseSpecId).getRequiredAmount();
        packingFormService.generateWeighingList(packingNum, requiredAmount, Integer.parseInt(bundleNum));
    }

    @RequestMapping("/insert_packing_form")
    @ResponseBody
    public void insertPackingForm(String batchNum) {
        Integer count = packingFormService.countByBatchNum(batchNum);
        if (count > 0) {
            return;
        } else {
            DecimalFormat df = new DecimalFormat("000000");
            String str = df.format(packingFormService.getTotalAmount());
            String packingNum = "Z" + str;
            packingFormService.insertPackingForm(batchNum, packingNum);
        }
    }

}
