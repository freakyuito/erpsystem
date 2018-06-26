package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.PackingFormMapper;
import cn.overseachem.erp.pojo.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class PackingFormService {

    @Autowired
    private PackingFormMapper mapper;

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
        packingFormWithBLOBs.setWeighingList(result);
        mapper.updateByPrimaryKeyWithBLOBs(packingFormWithBLOBs);
    }

    public List<PackingFormDataItem> getWeighingList(String packingNum) {
        return str2List(mapper.selectByPrimaryKey(packingNum).getWeighingList());
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

        List<PackingFormDataItem> arrayList = str2List(mapper.selectByPrimaryKey(packingNum).getWeighingList());

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
        packingFormWithBLOBs.setWeighingList(result);

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

    public void setWasteList(String packingNum,List<PackingFormDataItem> items){
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
        if (packingFormList != null)
            return packingFormList.get(0).getPackingNum();
        return null;
    }

    public Integer countByBatchNum(String batchNum) {
        PackingFormExample e = new PackingFormExample();
        e.createCriteria().andFkBatchNumEqualTo(batchNum);
        return mapper.countByExample(e);
    }

    public void insertPackingForm(String batchNum, String packingNum) {
        PackingFormWithBLOBs packingFormWithBLOBs = new PackingFormWithBLOBs();
        packingFormWithBLOBs.setFkBatchNum(batchNum);
        packingFormWithBLOBs.setPackingNum(packingNum);
        mapper.insert(packingFormWithBLOBs);
    }

    public Integer getTotalAmount() {
        PackingFormExample e = new PackingFormExample();
        e.createCriteria();
        return mapper.countByExample(e);
    }

    public Boolean isWeighingListEmpty(String packingNum) {
        if (mapper.selectByPrimaryKey(packingNum).getWeighingList() == null)
            return true;
        else
            return false;
    }

}
