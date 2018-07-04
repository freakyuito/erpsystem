package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.GodownEntry;
import cn.overseachem.erp.pojo.GodownEntrySpec;
import cn.overseachem.erp.service.GodownEntryService;
import cn.overseachem.erp.service.ProductOrderService;
import cn.overseachem.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    @Autowired
    private ProductOrderService productOrderService;

    @RequestMapping("/2lst")
    public String listPage() {
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

    public HashMap<String, Date> getTimePeriod(Date now) {
        HashMap<String, Date> period = new HashMap<String, Date>();

        Calendar calendar = Calendar.getInstance();
        Calendar calendarBegin = Calendar.getInstance();
        Calendar calendarEnd = Calendar.getInstance();
        calendar.setTime(now);
        calendarBegin.setTime(now);
        calendarEnd.setTime(now);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour >= 8 && hour <= 19) {
            calendarBegin.set(Calendar.HOUR_OF_DAY, 8);
            calendarBegin.set(Calendar.MINUTE, 0);
            calendarBegin.set(Calendar.SECOND, 0);
            calendarEnd.set(Calendar.HOUR_OF_DAY, 19);
            calendarEnd.set(Calendar.MINUTE, 59);
            calendarEnd.set(Calendar.SECOND, 59);
        } else {
            calendarBegin.set(Calendar.HOUR_OF_DAY, 20);
            calendarBegin.set(Calendar.MINUTE, 0);
            calendarBegin.set(Calendar.SECOND, 0);
            calendarEnd.add(calendar.DATE, 1);
            calendarEnd.set(Calendar.HOUR_OF_DAY, 7);
            calendarEnd.set(Calendar.MINUTE, 59);
            calendarEnd.set(Calendar.SECOND, 59);
        }
        period.put("dateBegin", calendarBegin.getTime());
        period.put("dateEnd", calendarEnd.getTime());
        System.out.println(period.toString());
        return period;
    }

    public GodownEntry isFormExist(Integer machineId, Date now) {
        return godownEntryService.getByMachineIdAndDatePeriod(machineId, getTimePeriod(now).get("dateBegin"), getTimePeriod(now).get("dateEnd"));
    }

    public GodownEntrySpec isSpecExist(String inventoryNum, String batchNum) {
        return godownEntryService.getSpecByInventoryNumAndBatchNum(inventoryNum, batchNum);
    }

    public GodownEntry insertForm(Integer machineId, String monitorName, String commanderName, String recorderName, String inspectorName, Integer workgroupId) {
        GodownEntry godownEntry = new GodownEntry();
        godownEntry.setMonitorId(userService.getIdByRealName(monitorName));
        godownEntry.setCommanderId(userService.getIdByRealName(commanderName));
        godownEntry.setRecorderId(userService.getIdByRealName(recorderName));
        godownEntry.setInspectorId(userService.getIdByRealName(inspectorName));
        godownEntry.setWorkgroupId(workgroupId);
        godownEntry.setMachineId(machineId);
        godownEntry.setGenerateTime(new Date());
        godownEntry.setInventoryNum(generateInventoryNum());
        System.out.println(godownEntry.toString());
        godownEntryService.insert(godownEntry);
        return godownEntry;
    }

    public void insertSpec(String inventoryNum, String batchNum, Integer finishedQty, Float finishedWgt, Integer inventoryQty, Float inventoryWgt, Float wasteWgt) {
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

    public void updateSpec(GodownEntrySpec spec, String inventoryNum, String batchNum, Integer finishedQty, Float finishedWgt, Integer inventoryQty, Float inventoryWgt, Float wasteWgt) {
        spec.setFkInventoryNum(inventoryNum);
        spec.setWasteWeight(wasteWgt + spec.getWasteWeight());
        spec.setInventoryWeight(inventoryWgt + spec.getInventoryWeight());
        spec.setInventoryQuantity(inventoryQty + spec.getInventoryQuantity());
        spec.setFkBatchNum(batchNum);
        spec.setFinishedWeight(finishedWgt + spec.getFinishedWeight());
        spec.setFinishedQuantity(finishedQty + spec.getFinishedQuantity());
        godownEntryService.updateSpec(spec);
    }

    @RequestMapping("/shift")
    @ResponseBody
    public void shift(String monitorName, String commanderName, String recorderName,
                      String inspectorName, Integer workgroupId, String batchNum, Integer finishedQty,
                      Float finishedWgt, Integer inventoryQty, Float inventoryWgt, Float wasteWgt) {
        Integer machineId = productOrderService.getMachineIdByBatchNum(batchNum);
        System.out.println(machineId + monitorName + commanderName + recorderName + inspectorName + workgroupId + batchNum + finishedQty + finishedWgt
                + inventoryQty + inventoryWgt + wasteWgt);
        GodownEntry godownEntry = isFormExist(machineId, new Date());
        if (godownEntry != null) {
            GodownEntrySpec spec = isSpecExist(godownEntry.getInventoryNum(), batchNum);
            if (spec != null) {
                updateSpec(spec, godownEntry.getInventoryNum(), batchNum, finishedQty, finishedWgt, inventoryQty, inventoryWgt, wasteWgt);
            } else {
                insertSpec(godownEntry.getInventoryNum(), batchNum, finishedQty, finishedWgt, inventoryQty, inventoryWgt, wasteWgt);
            }
        } else {
            GodownEntry godownEntry1 = insertForm(machineId, monitorName, commanderName, recorderName, inspectorName, workgroupId);
            assert godownEntry1 != null;
            insertSpec(godownEntry1.getInventoryNum(), batchNum, finishedQty, finishedWgt, inventoryQty, inventoryWgt, wasteWgt);
        }
    }
}
