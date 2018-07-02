package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.ColorMapper;
import cn.overseachem.erp.mapper.GodownEntryMapper;
import cn.overseachem.erp.mapper.GodownEntrySpecMapper;
import cn.overseachem.erp.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
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

    public void insert(GodownEntry godownEntry) {
        godownEntryMapper.insert(godownEntry);
    }

    public void insertSpec(GodownEntrySpec spec) {
        godownEntrySpecMapper.insert(spec);
    }

    public GodownEntry isExist(Integer machineId, Date date) {
        try {
            String utDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
            GodownEntryExample e = new GodownEntryExample();
            e.createCriteria().andMachineIdEqualTo(machineId).andGenerateTimeEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(utDate));
            if (godownEntryMapper.selectByExample(e).size() > 0)
                return godownEntryMapper.selectByExample(e).get(0);
            else
                return null;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Integer countAll() {
        GodownEntryExample e = new GodownEntryExample();
        e.createCriteria();
        return godownEntryMapper.countByExample(e);
    }

    public GodownEntry getByMachineIdAndDate(Integer machineId, Date date) {
        String strDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        try {
            Date utDate = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
            GodownEntryExample e = new GodownEntryExample();
            e.createCriteria().andMachineIdEqualTo(machineId).andGenerateTimeEqualTo(utDate);
            return godownEntryMapper.selectByExample(e).get(0);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}