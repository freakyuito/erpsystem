package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.PackingFormMapper;
import cn.overseachem.erp.mapper.ProductOrderSpecMapper;
import cn.overseachem.erp.mapper.PurchaseOrderMapper;
import cn.overseachem.erp.mapper.PurchaseOrderSpecMapper;
import cn.overseachem.erp.pojo.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.geom.FlatteningPathIterator;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class PackingFormService {

    @Autowired
    private PackingFormMapper mapper;
    @Autowired
    private ProductOrderSpecMapper productOrderSpecMapper;
    @Autowired
    private PurchaseOrderSpecMapper purchaseOrderSpecMapper;
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    public void generateWeighingList(String packingNum, Integer requiredAmount, Integer bundleNum) {
        ArrayList<PackingFormDataItem> arrayList = new ArrayList<PackingFormDataItem>();

        for (int i = 0; i < requiredAmount / bundleNum; i++) {
            arrayList.add(new PackingFormDataItem(i + 1 + "", bundleNum.toString(), "0"));
        }
        if (requiredAmount % bundleNum != 0) {
            arrayList.add(new PackingFormDataItem(requiredAmount / bundleNum + 1 + "", requiredAmount % bundleNum + "", "0"));
        }
        String result = JSON.toJSONString(arrayList);
        PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
        packingFormWithBLOBs.setFinishedList(result);
        mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
    }

    public List<PackingFormDataItem> getFinishedList(String packingNum) {
        return str2List(mapper.selectByPrimaryKey(packingNum).getFinishedList());
    }

    public List<PackingFormDataItem> getWasteList(String packingNum) {
        return str2List(mapper.selectByPrimaryKey(packingNum).getWasteList());
    }

    public List<PackingFormDataItem> getInventoryList(String packingNum) {
        return str2List(mapper.selectByPrimaryKey(packingNum).getInventoryList());
    }

    public List<PackingFormDataItem> str2List(String jsonStr) {
        ArrayList<PackingFormDataItem> arrayList = new ArrayList<PackingFormDataItem>();
        JSONArray jsonArray = JSONArray.parseArray(jsonStr);
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                arrayList.add(new PackingFormDataItem(jsonObject.getString("index"), jsonObject.getString("key"),
                        jsonObject.getString("value")));
            }
            return arrayList;
        } else {
            return null;
        }
    }

    public void setWeighingData(String packingNum, String index, String quantity, String weight) {

        List<PackingFormDataItem> arrayList = str2List(mapper.selectByPrimaryKey(packingNum).getFinishedList());

        for (PackingFormDataItem s : arrayList
                ) {
            if (s.getIndex().equals(index)) {
                s.setIndex(index);
                s.setKey(quantity);
                s.setValue(weight);
            }
        }
        String result = JSON.toJSONString(arrayList);
        PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
        packingFormWithBLOBs.setFinishedList(result);

        mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
    }

    public void setWasteData(String packingNum, String index, String quantity, String weight) {
        String origin = mapper.selectByPrimaryKey(packingNum).getWasteList();
        if (origin != null) {
            List<PackingFormDataItem> arrayList = str2List(origin);

            int count = 0;
            for (PackingFormDataItem s : arrayList
                    ) {
                if (s.getIndex().equals(index)) {
                    s.setIndex(index);
                    s.setKey(quantity);
                    s.setValue(weight);
                    count++;
                }
            }
            if (count == 0) {
                arrayList.add(new PackingFormDataItem(index, quantity, weight));
            }

            String result = JSON.toJSONString(arrayList);
            PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
            packingFormWithBLOBs.setWasteList(result);
            mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
        } else {
            ArrayList<PackingFormDataItem> arrayList = new ArrayList<PackingFormDataItem>();

            arrayList.add(new PackingFormDataItem(index, quantity, weight));
            String result = JSON.toJSONString(arrayList);
            PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
            packingFormWithBLOBs.setWasteList(result);
            mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
        }

    }

    public void setInventoryData(String packingNum, String index, String quantity, String weight) {

        String origin = mapper.selectByPrimaryKey(packingNum).getInventoryList();
        if (origin != null) {
            List<PackingFormDataItem> arrayList = str2List(origin);

            int count = 0;
            for (PackingFormDataItem s : arrayList
                    ) {
                if (s.getIndex().equals(index)) {
                    s.setIndex(index);
                    s.setKey(quantity);
                    s.setValue(weight);
                    count++;
                }
            }
            if (count == 0) {
                arrayList.add(new PackingFormDataItem(index, quantity, weight));
            }

            String result = JSON.toJSONString(arrayList);
            PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
            packingFormWithBLOBs.setInventoryList(result);
            mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
        } else {
            ArrayList<PackingFormDataItem> arrayList = new ArrayList<PackingFormDataItem>();

            arrayList.add(new PackingFormDataItem(index, quantity, weight));
            String result = JSON.toJSONString(arrayList);
            PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
            packingFormWithBLOBs.setInventoryList(result);
            mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
        }

    }

    public void setWeighingList(String packingNum, List<PackingFormDataItem> items) {
        String result = JSON.toJSONString(items);
        PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
        packingFormWithBLOBs.setFinishedList(result);
        mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
        System.out.println("set weighing list:" + result);
    }

    public void setWasteList(String packingNum, List<PackingFormDataItem> items) {
        String result = JSON.toJSONString(items);
        PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
        packingFormWithBLOBs.setWasteList(result);
        mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
        System.out.println("set waste list:" + result);
    }

    public void setInventoryList(String packingNum, List<PackingFormDataItem> items) {
        String result = JSON.toJSONString(items);
        PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
        packingFormWithBLOBs.setInventoryList(result);
        mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
    }

    public String getPackingNumByBatchNum(String batchNum) {
        PackingFormExample e = new PackingFormExample();
        e.createCriteria().andFkBatchNumEqualTo(batchNum);
        List<PackingForm> packingFormList = mapper.selectByExample(e);
        if (packingFormList != null && packingFormList.size() > 0)
            return packingFormList.get(0).getPackingNum();
        return null;
    }

    public Integer countByBatchNum(String batchNum) {
        PackingFormExample e = new PackingFormExample();
        e.createCriteria().andFkBatchNumEqualTo(batchNum);
        return mapper.countByExample(e);
    }

    public void insertPackingFormWithBatchNum(String batchNum, String packingNum) {
        PackingFormWithBLOBs packingFormWithBLOBs = new PackingFormWithBLOBs();
        packingFormWithBLOBs.setFkBatchNum(batchNum);
        packingFormWithBLOBs.setPackingNum(packingNum);
        mapper.insert(packingFormWithBLOBs);
    }

    public void insertPackingForm(String packingNum) {
        PackingFormWithBLOBs packingFormWithBLOBs = new PackingFormWithBLOBs();
        packingFormWithBLOBs.setPackingNum(packingNum);
        mapper.insert(packingFormWithBLOBs);
    }

    public Integer getTotalAmount() {
        PackingFormExample e = new PackingFormExample();
        e.createCriteria();
        return mapper.countByExample(e);
    }

    public Boolean isWeighingListEmpty(String packingNum) {
        if (mapper.selectByPrimaryKey(packingNum).getFinishedList() == null)
            return true;
        else
            return false;
    }

    public List<List<HashMap<String, Object>>> getByCriteria(String purchaseNum, String colorId, String batchNum, String packingNum) {
        return mapper.getByCriteria(purchaseNum, colorId, batchNum, packingNum);
    }

    public List<PackingForm> getFreePackingForm(String packingNum) {
        PackingFormExample e = new PackingFormExample();
        e.createCriteria().andPackingNumLike("%" + packingNum + "%");
        return mapper.selectByExample(e);
    }

    public Integer getCompletedAmountByPackingNum(String packingNum) {
        PackingFormWithBLOBs p = mapper.selectByPrimaryKey(packingNum);
        List<PackingFormDataItem> arrayList = str2List(p.getFinishedList());
        Integer totalAmount = 0;
        for (PackingFormDataItem i : arrayList
                ) {
            if (Float.parseFloat(i.getValue()) != 0) {
                totalAmount += Integer.parseInt(i.getKey());
                System.out.println(i.getValue());
            }
        }
        System.out.println(totalAmount);
        return totalAmount;
    }

    public Float getCompletedWeightByPackingNum(String packingNum) {
        System.out.println(packingNum);
        PackingFormWithBLOBs p = mapper.selectByPrimaryKey(packingNum);
        List<PackingFormDataItem> arrayList = str2List(p.getFinishedList());
        Float totalWeight = 0f;
        if (arrayList == null)
            return 0f;
        else {
            for (PackingFormDataItem i : arrayList
                    ) {
                if (Float.parseFloat(i.getValue()) != 0) {
                    totalWeight += Float.parseFloat(i.getValue());
                }
            }
            DecimalFormat d = new DecimalFormat("#.00");
            return Float.valueOf(d.format(totalWeight));
        }

    }

    public String getBatchNumByPackingNum(String packingNum) {
        return mapper.selectByPrimaryKey(packingNum).getFkBatchNum();
    }

    public void shift(String finishedRecord, String wasteRecord, String inventoryRecord, String packingNum) {
        PackingFormWithBLOBs form = mapper.selectByPrimaryKey(packingNum);
        String newRecord = null;
        if (form.getFinishedRecords() != null)
            newRecord = form.getFinishedRecords() + "," + finishedRecord;
        else
            newRecord = "," + finishedRecord;
        form.setFinishedRecords(newRecord);
        newRecord = null;
        if (form.getWasteRecords() != null)
            newRecord = form.getWasteRecords() + "," + wasteRecord;
        else
            newRecord = "," + wasteRecord;
        form.setWasteRecords(newRecord);
        newRecord = null;
        if (form.getInventoryRecords() != null)
            newRecord = form.getInventoryRecords() + "," + inventoryRecord;
        else
            newRecord = "," + inventoryRecord;
        form.setInventoryRecords(newRecord);
        mapper.updateByPrimaryKeyWithBLOBs(form);
    }

    public PackingFormWithBLOBs getByPackingNum(String packingNum) {
        return mapper.selectByPrimaryKey(packingNum);
    }

    public Float getWeightByBatchNum(String batchNum) {
        PackingFormWithBLOBs bloBs = getByPackingNum(getPackingNumByBatchNum(batchNum));
        if (bloBs != null) {
            if (bloBs.getFinishedRecords() != null) {
                Float totalWeight = 0f;
                List<PackingFormDataItem> items = getFinishedList(getPackingNumByBatchNum(batchNum));
                for (PackingFormDataItem i : items
                        ) {
                    if (!i.getKey().equals("0"))
                        totalWeight += Float.parseFloat(i.getValue());
                }
                return totalWeight;
            } else {
                return 0f;
            }
        } else {
            return 0f;
        }
    }

    public PurchaseOrder getPurchaseOrderByPackingForm(PackingForm target) {
        if (target.getFkBatchNum() != null)
            return purchaseOrderMapper.selectByPrimaryKey(purchaseOrderSpecMapper.selectByPrimaryKey(productOrderSpecMapper.selectByPrimaryKey(target.getFkBatchNum()).getFkPurchaseSpecId()).getFkPurchaseNum());
        return null;
    }

    public PurchaseOrderSpec getPurchaseOrderSpecByPackingForm(PackingForm target){
        if(target.getFkBatchNum()!=null)
            return purchaseOrderSpecMapper.selectByPrimaryKey(productOrderSpecMapper.selectByPrimaryKey(target.getFkBatchNum()).getFkPurchaseSpecId());
        return null;
    }
}
