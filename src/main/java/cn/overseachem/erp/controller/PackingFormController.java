package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.PackingFormWeighingList;
import cn.overseachem.erp.pojo.User;
import cn.overseachem.erp.service.PackingFormService;
import cn.overseachem.erp.service.ProductOrderService;
import cn.overseachem.erp.service.PurchaseOrderService;
import cn.overseachem.erp.service.UserService;
import cn.overseachem.erp.utils.String2Json;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/2dtl")
    public String detailPage() {
        return "/product/plate/packing_form/dtl";
    }

    @RequestMapping("/get_weighing_list")
    @ResponseBody
    public List<PackingFormWeighingList> sendWeighingData(String batchNum) {
        ArrayList<PackingFormWeighingList> arrayList = new ArrayList<PackingFormWeighingList>();
        JsonArray jsonArray = new JsonParser().parse(packingFormService.getWeighingList(batchNum)).getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); i++) {
            arrayList.add(new PackingFormWeighingList(jsonArray.get(i).getAsJsonObject().get("index").getAsString(), jsonArray.get(i).getAsJsonObject().get("quantity").getAsString(),
                    jsonArray.get(i).getAsJsonObject().get("weight").getAsString()));
        }
        return arrayList;
    }

    @RequestMapping("/set_weighing_data")
    @ResponseBody
    public void setWeighingData(String batchNum, String index, String quantity, String weight) {
        packingFormService.setWeighingData(batchNum, index, quantity, weight);
    }

    @RequestMapping("/generate_weighing_list")
    @ResponseBody
    public void generateWeighingList(String batchNum, String bundleNum) {
        String packingNum = packingFormService.getPackingNumByBatchNum(batchNum);
        Integer purchaseSpecId = productOrderService.getPurchaseSpecIdAmountByBatchNum(batchNum);
        Integer amount = purchaseOrderService.getById(purchaseSpecId).getRequiredAmount();
        packingFormService.generateWeighingList(packingNum, amount / Integer.parseInt(bundleNum));
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
