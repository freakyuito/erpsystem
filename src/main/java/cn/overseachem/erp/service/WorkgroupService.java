package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.ColorMapper;
import cn.overseachem.erp.pojo.Color;
import cn.overseachem.erp.pojo.ColorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class WorkgroupService {

    public String getNameById(Integer id) {
        switch (id){
            case 1:return "甲一白";
            case 2:return "甲一夜";
            case 3:return "甲二白";
            case 4:return "甲二夜";
            case 5:return "乙一白";
            case 6:return "乙一夜";
            case 7:return "乙二白";
            case 8:return "乙二夜";
            case 9:return "丙一白";
            case 10:return "丙一夜";
            case 11:return "丙二白";
            case 12:return "丙二夜";
            default:break;
        }
        return null;
    }

    public Integer getIdByName(String name){
        switch (name){
            case "甲一白":return 1;
            case "甲一夜":return 2;
            case "甲二白":return 3;
            case "甲二夜":return 4;
            case "乙一白":return 5;
            case "乙一夜":return 6;
            case "乙二白":return 7;
            case "乙二夜":return 8;
            case "丙一白":return 9;
            case "丙一夜":return 10;
            case "丙二白":return 11;
            case "丙二夜":return 12;
            default:break;
        }
        return null;
    }

    public List<String> getAll(){
        ArrayList<String> names = new ArrayList<>();
        names.add("甲一白");
        names.add("甲一夜");
        names.add("甲二白");
        names.add("甲二夜");
        names.add("乙一白");
        names.add("乙一夜");
        names.add("乙二白");
        names.add("乙二夜");
        names.add("丙一白");
        names.add("丙一夜");
        names.add("丙二白");
        names.add("丙二夜");
        return names;
    }
}