package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.ColorMapper;
import cn.overseachem.erp.mapper.MachineMapper;
import cn.overseachem.erp.pojo.Color;
import cn.overseachem.erp.pojo.ColorExample;
import cn.overseachem.erp.pojo.Machine;
import cn.overseachem.erp.pojo.MachineExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Component
public class MachineService {

    @Autowired
    private MachineMapper mapper;

    public List<Machine> getAll() {
        MachineExample e = new MachineExample();
        e.createCriteria();
        return mapper.selectByExample(e);
    }

    public Machine getById(Integer machineId) {
        return mapper.selectByPrimaryKey(machineId);
    }

    public Machine getByBatchNum(String batchNum){
        MachineExample e = new MachineExample();
        e.createCriteria().andOccupiedBatchNumEqualTo(batchNum);
        if ()
        mapper.selectByExample(e).get(0);
    }
}