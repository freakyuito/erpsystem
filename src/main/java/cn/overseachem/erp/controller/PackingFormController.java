package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.*;
import cn.overseachem.erp.service.ColorService;
import cn.overseachem.erp.service.PackingFormService;
import cn.overseachem.erp.service.ProductOrderService;
import cn.overseachem.erp.service.PurchaseOrderService;
import cn.overseachem.erp.utils.AjaxReturn;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.codehaus.groovy.util.ListHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
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

    @RequestMapping("/2lst")
    public String listPage() {
        return "/product/plate/packing_form/lst";
    }

    @RequestMapping("/2add_free")
    public String addFreePage() {
        return "/product/plate/packing_form/add_free";
    }

    @RequestMapping("/get_by_criteria")
    @ResponseBody
    public List<PackingFormLstGrid> getByCriteria(String purchaseNum, String colorId, String batchNum, String packingNum) {
        List<List<HashMap<String, Object>>> map = packingFormService.getByCriteria(purchaseNum, colorId, batchNum, packingNum);
        JSONArray jsonArray = (JSONArray) JSONArray.toJSON(map);
        ArrayList<PackingFormLstGrid> grids = new ArrayList<PackingFormLstGrid>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Integer machineId = productOrderService.getMachineIdByBatchNum(jsonObject.getString("batch_num"));
            PackingFormLstGrid grid = new PackingFormLstGrid(jsonObject.getString("fk_purchase_num"),
                    colorService.getNameById(jsonObject.getString("color_id")), jsonObject.getString("batch_num"),
                    machineId + "", jsonObject.getInteger("length").toString() + " * " + jsonObject.getInteger("width").toString() + " * " +
                    jsonObject.getFloat("thickness").toString(), jsonObject.getInteger("completed_amount").toString() + "/" + jsonObject.getInteger("required_amount").toString(),
                    packingFormService.getCompletedWeightByPackingNum(jsonObject.getString("packing_num")).toString(), jsonObject.getString("packing_num"));
            grids.add(grid);
        }
        return grids;
    }

    @RequestMapping("/get_free_packing_form")
    @ResponseBody
    public List<PackingFormLstGrid> getFreePackingForm(String packingNum) {
        List<PackingForm> packingFormList = packingFormService.getFreePackingForm(packingNum);

        ArrayList<PackingFormLstGrid> grids = new ArrayList<PackingFormLstGrid>();
        for (PackingForm s : packingFormList
                ) {
            if (s.getFkBatchNum() == null) {
                PackingFormLstGrid grid = new PackingFormLstGrid();
                grid.setPackingNum(s.getPackingNum());
                grids.add(grid);
            }
        }
        return grids;
    }

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
        grid.setWeighingListEmpty(packingFormService.isWeighingListEmpty(packingNum));
        model.addAttribute("packingFormDtlGrid", grid);
        return "/product/plate/packing_form/dtl";
    }

    @RequestMapping("/2dtl_free")
    public String detailFreePage(String packingNum, Model model) {
        PackingFormDtlGrid grid = new PackingFormDtlGrid();
        grid.setPackingNum(packingNum);
        model.addAttribute("packingFormDtlGrid", grid);
        return "/product/plate/packing_form/dtl_free";
    }

    @RequestMapping("/get_weighing_list")
    @ResponseBody
    public List<PackingFormDataItem> getWeighingList(String packingNum) {
        PackingFormWithBLOBs bloBs = packingFormService.getByPackingNum(packingNum);
        if (bloBs.getExchangeRecords() != null) {
            Integer begin = decodeShiftRecord(bloBs.getExchangeRecords()).get("begin");
            Integer end = decodeShiftRecord(bloBs.getExchangeRecords()).get("end");
            ArrayList<PackingFormDataItem> results = new ArrayList<PackingFormDataItem>();
            List<PackingFormDataItem> items = packingFormService.getWeighingList(packingNum);
            for (PackingFormDataItem i : items
                    ) {
                if (items.indexOf(i) >= begin - 1 && items.indexOf(i) <= end - 1) ;
                else results.add(i);
            }
            return results;
        } else {
            return packingFormService.getWeighingList(packingNum);
        }
    }

    @RequestMapping("/get_waste_list")
    @ResponseBody
    public List<PackingFormDataItem> getWasteList(String packingNum) {
        return packingFormService.getWasteList(packingNum);
    }

    @RequestMapping("/get_inventory_list")
    @ResponseBody
    public List<PackingFormDataItem> getInventoryList(String packingNum) {
        return packingFormService.getInventoryList(packingNum);
    }

    @RequestMapping("/set_weighing_data")
    @ResponseBody
    public void setWeighingData(String packingNum, String index, String quantity, String weight) {
        packingFormService.setWeighingData(packingNum, index, quantity, weight);
        productOrderService.setCompletedAmount(packingFormService.getBatchNumByPackingNum(packingNum), packingFormService.getCompletedAmountByPackingNum(packingNum));
    }

    @RequestMapping("/set_waste_data")
    @ResponseBody
    public void setWasteData(String packingNum, String index, String quantity, String weight) {
        packingFormService.setWasteData(packingNum, index, quantity, weight);
    }

    @RequestMapping("/set_inventory_data")
    @ResponseBody
    public void setInventoryData(String packingNum, String index, String quantity, String weight) {
        packingFormService.setInventoryData(packingNum, index, quantity, weight);
    }

    @RequestMapping("/generate_weighing_list")
    @ResponseBody
    public void generateWeighingList(String batchNum, String bundleNum) {
        String packingNum = packingFormService.getPackingNumByBatchNum(batchNum);
        if (packingFormService.isWeighingListEmpty(packingNum)) {
            System.out.println("generating weighing list");
            Integer purchaseSpecId = productOrderService.getPurchaseSpecRequiredAmountByBatchNum(batchNum);
            Integer requiredAmount = purchaseOrderService.getSpecById(purchaseSpecId).getRequiredAmount();
            packingFormService.generateWeighingList(packingNum, requiredAmount, Integer.parseInt(bundleNum));
        } else {
            System.out.println("no need to generate weighing list");
        }
    }

    @RequestMapping("/insert_packing_form_with_batch_num")
    @ResponseBody
    public void insertPackingFormWithBatchNum(String batchNum) {
        Integer count = packingFormService.countByBatchNum(batchNum);
        if (count > 0) {
            return;
        } else {
            packingFormService.insertPackingFormWithBatchNum(batchNum, getPackingNum());
        }
    }

    @RequestMapping("/insert_packing_form")
    @ResponseBody
    public void insertPackingForm() {
        packingFormService.insertPackingForm(getPackingNum());
    }

    @RequestMapping("/set_weighing_list")
    @ResponseBody
    public void setWeighingList(HttpServletRequest request) {
        String packingNum = request.getParameter("packingNum");
        ArrayList<PackingFormDataItem> items = new ArrayList<PackingFormDataItem>();
        int count = 1;
        for (int i = 0; ; i++) {
            String index = request.getParameter("index_" + i);
            if (index == null) break;
            String key = request.getParameter("key_" + i);
            String value = request.getParameter("value_" + i);
            PackingFormDataItem item = new PackingFormDataItem(count + "", key, value);
            if (key.equals("") && value.equals("")) {

            } else {
                items.add(item);
                count++;
            }
            System.out.println("controller-set weighing list:" + item.toString());
        }
        packingFormService.setWeighingList(packingNum, items);
        productOrderService.setCompletedAmount(packingFormService.getBatchNumByPackingNum(packingNum), packingFormService.getCompletedAmountByPackingNum(packingNum));
    }

    @RequestMapping("/set_waste_list")
    @ResponseBody
    public void setWasteList(HttpServletRequest request) {
        String packingNum = request.getParameter("packingNum");
        ArrayList<PackingFormDataItem> items = new ArrayList<PackingFormDataItem>();
        int count = 1;
        for (int i = 0; ; i++) {
            String index = request.getParameter("index_" + i);
            if (index == null) break;
            String key = request.getParameter("key_" + i);
            String value = request.getParameter("value_" + i);
            PackingFormDataItem item = new PackingFormDataItem(count + "", key, value);
            if (key.equals("") && value.equals("")) {

            } else {
                items.add(item);
                count++;
            }
            System.out.println("controller-set waste list:" + item.toString());
        }
        packingFormService.setWasteList(packingNum, items);
    }

    @RequestMapping("/set_inventory_list")
    @ResponseBody
    public void setInventoryList(HttpServletRequest request) {
        String packingNum = request.getParameter("packingNum");
        ArrayList<PackingFormDataItem> items = new ArrayList<PackingFormDataItem>();
        int count = 1;
        for (int i = 0; ; i++) {
            String index = request.getParameter("index_" + i);
            if (index == null) break;
            String key = request.getParameter("key_" + i);
            String value = request.getParameter("value_" + i);
            if (key.equals("") && value.equals("")) {

            } else {
                items.add(new PackingFormDataItem(count + "", key, value));
                count++;
            }
        }
        packingFormService.setInventoryList(packingNum, items);
    }

    @RequestMapping("/get_packing_num")
    @ResponseBody
    public String getPackingNum() {
        DecimalFormat df = new DecimalFormat("000000");
        String str = df.format(packingFormService.getTotalAmount());
        return "Z" + str;
    }

    @RequestMapping("/shift")
    @ResponseBody
    public void shift(String shiftRecord, String packingNum) {
        packingFormService.shift(shiftRecord, packingNum);
    }

    public HashMap<String, Integer> decodeShiftRecord(String record) {
        if (record != null) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            String[] records = record.split(",");
            String[] pages = records[records.length - 1].split("-");
            map.put("begin", Integer.parseInt(pages[0]));
            map.put("end", Integer.parseInt(pages[1]));
            return map;
        }
        return null;
    }

}
