package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.Machine;
import cn.overseachem.erp.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/product/plate/machine")
public class MachineController {

    @Autowired
    private MachineService service;

    @RequestMapping("/get_all")
    @ResponseBody
    public List<Machine> getAll() {
        return service.getAll();
    }

    @RequestMapping("/get_batch_num_by_id")
    @ResponseBody
    public String getBatchNumById(Integer machineId) {
        return service.getById(machineId).getOperateBatchNum();
    }

    @RequestMapping("/get_availables_id")
    @ResponseBody
    public List<Integer> getAvailablesMachineId(){
        ArrayList<Integer> integers = new ArrayList<Integer>();
        List<Machine> machines = service.getAvailables();
        for (Machine m:machines
             ) {
            integers.add(m.getMachineId());
        }
        return integers;
    }

    @RequestMapping("/is_available_by_id")
    @ResponseBody
    public Boolean isAvailableById(Integer machineId){
        Machine m = service.getById(machineId);
        if(m.getOperateBatchNum() != null)
            return false;
        else
            return true;
    }

    @RequestMapping("/occupy_by_id")
    @ResponseBody
    public void occupyById(Integer machineId,String batchNum){
        service.occupyById(machineId,batchNum);
    }

    @RequestMapping("/release_by_id")
    @ResponseBody
    public void releaseById(Integer machineId){
        service.releaseById(machineId);
    }
}
