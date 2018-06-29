package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.Machine;
import cn.overseachem.erp.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */
@Controller
@RequestMapping("/plate/machine")
public class MachineController {

//    @Autowired
//    private MachineService service;
//
//    @RequestMapping("/get_all")
//    @ResponseBody
//    public List<Machine> getAll() {
//        return service.getAll();
//    }
//
//    @RequestMapping("/get_occupation_by_id")
//    @ResponseBody
//    public String getOccupationById(Integer machineId){
//        return service.getById(machineId).getOccupiedBatchNum();
//    }
}
