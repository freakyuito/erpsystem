package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.PackingFormMapper;
import cn.overseachem.erp.pojo.*;
import com.alibaba.fastjson.JSON;
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

    public String getWeighingList(String packingNum) {
        return mapper.selectByPrimaryKey(packingNum).getWeighingList();
    }

    public void setWeighingData(String packingNum, String index, String quantity, String weight) {
        String original = getWeighingList(packingNum);
        ArrayList<PackingFormDataItem> arrayList = new ArrayList<PackingFormDataItem>();
        JsonArray jsonArray = new JsonParser().parse(original).getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); i++) {
            arrayList.add(new PackingFormDataItem(jsonArray.get(i).getAsJsonObject().get("index").getAsString(), jsonArray.get(i).getAsJsonObject().get("key").getAsString(),
                    jsonArray.get(i).getAsJsonObject().get("value").getAsString()));
        }

        for (PackingFormDataItem s : arrayList
                ) {
            if (s.getIndex().equals(index)) {
                s.setIndex(index);
                s.setKey(quantity);
                s.setValue(weight);
                System.out.println(s.toString());
            }
        }
        String result = JSON.toJSONString(arrayList);
        PackingFormWithBLOBs packingFormWithBLOBs = mapper.selectByPrimaryKey(packingNum);
        packingFormWithBLOBs.setWeighingList(result);

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

}
