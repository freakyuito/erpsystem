package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.PackingFormMapper;
import cn.overseachem.erp.mapper.UserMapper;
import cn.overseachem.erp.pojo.*;
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

    public String getWeighingList(String batchNum) {
        PackingFormExample e = new PackingFormExample();
        e.createCriteria().andFkBatchNumEqualTo(batchNum);
        return mapper.selectByExampleWithBLOBs(e).get(0).getWeighingList();
    }

    public void setWeighingData(String batchNum, String index, String quantity, String weight) {
        String original = getWeighingList(batchNum);
        ArrayList<PackingFormWeighingList> arrayList = new ArrayList<PackingFormWeighingList>();
        JsonArray jsonArray = new JsonParser().parse(original).getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); i++) {
            arrayList.add(new PackingFormWeighingList(jsonArray.get(i).getAsJsonObject().get("index").getAsString(),jsonArray.get(i).getAsJsonObject().get("quantity").getAsString(),
                    jsonArray.get(i).getAsJsonObject().get("weight").getAsString()));
        }

        for (PackingFormWeighingList s:arrayList
             ) {
            if(s.getIndex().equals(index)){
                s.setIndex(index);
                s.setQuantity(quantity);
                s.setWeight(weight);
            }
            System.out.println(s.toString());
        }

    }

}
