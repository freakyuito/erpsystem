package cn.overseachem.erp.service;


import cn.overseachem.erp.mapper.MachineMapper;
import cn.overseachem.erp.pojo.Machine;
import cn.overseachem.erp.pojo.MachineExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.crypto.Mac;
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

    public Machine getByBatchNum(String batchNum) {
        MachineExample e = new MachineExample();
        e.createCriteria().andOperateBatchNumEqualTo(batchNum);
        List<Machine> machines = mapper.selectByExample(e);
        if (machines != null)
            mapper.selectByExample(e).get(0);
        return null;
    }

    public List<Machine> getAvailables(){
        MachineExample e = new MachineExample();
        e.createCriteria().andOperateBatchNumIsNull();
        return mapper.selectByExample(e);
    }

    public void occupyById(Integer machineId,String batchNum){
        Machine m = mapper.selectByPrimaryKey(machineId);
        m.setOperateBatchNum(batchNum);
        mapper.updateByPrimaryKey(m);
    }

    public void releaseById(Integer machineId){
        Machine m = mapper.selectByPrimaryKey(machineId);
        m.setOperateBatchNum(null);
        mapper.updateByPrimaryKey(m);
    }
}