package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.ColorMapper;
import cn.overseachem.erp.mapper.GodownEntryMapper;
import cn.overseachem.erp.mapper.GodownEntrySpecMapper;
import cn.overseachem.erp.pojo.Color;
import cn.overseachem.erp.pojo.ColorExample;
import cn.overseachem.erp.pojo.GodownEntry;
import cn.overseachem.erp.pojo.GodownEntrySpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class GodownEntryService {

    @Autowired
    private GodownEntryMapper godownEntryMapper;
    @Autowired
    private GodownEntrySpecMapper godownEntrySpecMapper;

    public void insert(GodownEntry godownEntry){
        godownEntryMapper.insert(godownEntry);
    }

    public void insertSpec(GodownEntrySpec spec){
        godownEntrySpecMapper.insert(spec);
    }

    public Boolean isExist(String teamGroup,Integer machineId,String date){
        Date utDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
    }
}