package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.PackingFormMapper;
import cn.overseachem.erp.mapper.UserMapper;
import cn.overseachem.erp.pojo.*;
import com.alibaba.fastjson.JSON;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class PackingFormService {

    @Autowired
    private PackingFormMapper mapper;

    public void generateWeighingList(String packingNum, Integer amount) {
        ArrayList<PackingFormWeighingList> arrayList = new ArrayList<PackingFormWeighingList>();

        for (int i = 0; i < amount; i++) {
            arrayList.add(new PackingFormWeighingList(i + 1 + "", "15", "0"));
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
        ArrayList<PackingFormWeighingList> arrayList = new ArrayList<PackingFormWeighingList>();
        JsonArray jsonArray = new JsonParser().parse(original).getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); i++) {
            arrayList.add(new PackingFormWeighingList(jsonArray.get(i).getAsJsonObject().get("index").getAsString(), jsonArray.get(i).getAsJsonObject().get("quantity").getAsString(),
                    jsonArray.get(i).getAsJsonObject().get("weight").getAsString()));
        }

        for (PackingFormWeighingList s : arrayList
                ) {
            if (s.getIndex().equals(index)) {
                s.setIndex(index);
                s.setQuantity(quantity);
                s.setWeight(weight);
            }
            System.out.println(s.toString());
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

    public Integer countByBatchNum(String batchNum){
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
