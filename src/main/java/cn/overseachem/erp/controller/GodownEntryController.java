package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.GodownEntry;
import cn.overseachem.erp.pojo.GodownEntrySpec;
import cn.overseachem.erp.service.GodownEntryService;
import cn.overseachem.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Zhihui_Shen on 2018/6/29.
 */
@Controller
@RequestMapping("/product/plate/godown_entry")
public class GodownEntryController {
    @Autowired
    private GodownEntryService godownEntryService;
    @Autowired
    private UserService userService;

    @RequestMapping("/2lst")
    public String listPage() {
        getBeginTime(new Date(1530621572));
        return "/product/plate/godown_entry/lst";
    }

    @RequestMapping("2dtl")
    public String detailPage(String inventoryNum) {
        return "/product/plate/godown_entry/dtl";
    }

    private String generateInventoryNum() {
        DecimalFormat df = new DecimalFormat("000000");
        String str = df.format(godownEntryService.countAll());
        return "Z" + str;
    }

    public void getBeginTime(Date now) {
        DateFormat df = new SimpleDateFormat("hh:mm:ss");
        try {
            if (now.getTime() > df.parse("08:00:00").getTime() && now.getTime() > df.parse("19:59:59").getTime()) {
                System.out.println("day team");
            } else if (now.getTime() < df.parse("23:59:59").getTime() && now.getTime() > df.parse("20:00:00").getTime()
            || now.getTime() < df.parse("07:59:59").getTime() && now.getTime() > df.parse("00:00:00").getTime()) {
                System.out.println("night team");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public GodownEntry isExist(Integer machineId, Date now) {
        return godownEntryService.isExist(machineId, now);
    }

    public void insertForm(Integer machineId, String monitorName, String commanderName, String recorderName, String inspectorName, Integer workgroupId) {
        GodownEntry godownEntry = new GodownEntry();
        godownEntry.setMonitorId(userService.getIdByRealName(monitorName));
        godownEntry.setCommanderId(userService.getIdByRealName(commanderName));
        godownEntry.setRecorderId(userService.getIdByRealName(recorderName));
        godownEntry.setInspectorId(userService.getIdByRealName(inspectorName));
        godownEntry.setWorkgroupId(workgroupId);
        godownEntry.setMachineId(machineId);
        godownEntry.setGenerateTime(new Date());
        godownEntry.setInventoryNum(generateInventoryNum());
        godownEntryService.insert(godownEntry);
    }

    public void insertSpec(String inventoryNum, Integer machineId, String batchNum, Integer finishedQty, Float finishedWgt, Integer inventoryQty, Float inventoryWgt, Float wasteWgt) {
        GodownEntrySpec spec = new GodownEntrySpec();
        spec.setFinishedQuantity(finishedQty);
        spec.setFinishedWeight(finishedWgt);
        spec.setFkInventoryNum(inventoryNum);
        spec.setFkBatchNum(batchNum);
        spec.setInventoryQuantity(inventoryQty);
        spec.setInventoryWeight(inventoryWgt);
        spec.setWasteWeight(wasteWgt);
        godownEntryService.insertSpec(spec);
    }
}
