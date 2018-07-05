package cn.overseachem.erp.controller;

import cn.overseachem.erp.pojo.*;
import cn.overseachem.erp.service.*;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @Autowired
    private ColorService colorService;
    @Autowired
    private WorkgroupService workgroupService;

    @RequestMapping("/2lst")
    public String listPage() {
        return "/product/plate/godown_entry/lst";
    }

    @RequestMapping("2dtl")
    public String detailPage(String inventoryNum, Model model) {
        GodownEntry godownEntry = godownEntryService.getByInventory(inventoryNum);
        GodownEntryDtlGrid grid = new GodownEntryDtlGrid(new SimpleDateFormat("yyyy-MM-dd").format(godownEntry.getGenerateTime()), godownEntry.getMachineId().toString(), godownEntry.getWorkgroupId().toString(),
                godownEntry.getInventoryNum().toString(), userService.getNameById(godownEntry.getMonitorId()), userService.getNameById(godownEntry.getCommanderId()), userService.getNameById(godownEntry.getInspectorId()),
                userService.getNameById(godownEntry.getRecorderId()));
        ArrayList<GodownEntrySpecDtlGrid> specDtlGrids = new ArrayList<GodownEntrySpecDtlGrid>();
        List<GodownEntrySpec> specs = godownEntryService.getSpecsByInventoryNum(inventoryNum);
        for (GodownEntrySpec s : specs
                ) {
            PurchaseOrderSpec purchaseOrderSpec = productOrderService.getPurchaseOrderSpecByBatchNum(s.getFkBatchNum());
            specDtlGrids.add(new GodownEntrySpecDtlGrid(purchaseOrderSpec.getFkPurchaseNum(), purchaseOrderSpec.getColorId() + colorService.getNameById(purchaseOrderSpec.getColorId()), s.getFkBatchNum(),
                    purchaseOrderSpec.getLength() + "*" + purchaseOrderSpec.getWidth() + "*" + purchaseOrderSpec.getThickness(), s.getFinishedQuantity().toString(), s.getFinishedWeight().toString(),
                    s.getInventoryQuantity().toString(), s.getInventoryWeight().toString(), s.getWasteWeight().toString()));
        }
        model.addAttribute("godownEntryDtlGrid", grid);
        model.addAttribute("godownEntrySpecDtlGrid", specDtlGrids);
        return "/product/plate/godown_entry/dtl";
    }

    @RequestMapping("/get_by_criteria")
    @ResponseBody
    public List<GodownEntryLstGrid> getByCriteria(String startTime, String endTime, Integer machineId,
                                                  String workgroupName, String commanderName, String material, String inventoryNum) {
        if (machineId >= 2 && machineId <= 6 && material.equals("F") || machineId >= 7 && machineId <= 8 && material.equals("X")) {
            if (!commanderName.equals(""))
                commanderName = userService.getIdByRealName(commanderName).toString();
            if(!workgroupName.equals(""))
                workgroupName = workgroupService.getIdByName(workgroupName).toString();
            List<HashMap<String,Object>> maps = godownEntryService.getByCriteria(startTime, endTime, machineId.toString(), workgroupName, commanderName, inventoryNum);
            JSONArray jsonArray = (JSONArray) JSONArray.toJSON(maps);
            ArrayList<GodownEntryLstGrid> grids = new ArrayList<GodownEntryLstGrid>();
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                GodownEntryLstGrid grid = new GodownEntryLstGrid();
                grid.setCommanderName(userService.getNameById(jsonObject.getInteger("commander_id")));
                grid.setInspectorName(userService.getNameById(jsonObject.getInteger("inspector_id")));
                grid.setMonitorName(userService.getNameById(jsonObject.getInteger("monitor_id")));
                grid.setRecorderName(userService.getNameById(jsonObject.getInteger("recorder_id")));
                grid.setFinishedQty(jsonObject.getString("finished_quantity"));
                grid.setFinishedWgt(new DecimalFormat("#.0").format(Float.parseFloat(jsonObject.getString("finished_weight"))).toString());
                grid.setGenerateTime(jsonObject.getString("generate_time"));
                grid.setInventoryNum(jsonObject.getString("a"));
                grid.setMachinId(jsonObject.getString("machine_id"));
                grid.setWasteWgt(jsonObject.getString("waste_weight"));
                grid.setWorkgroup(workgroupService.getNameById(jsonObject.getInteger("workgroup_id")));
                grid.setMaterial(material);
                System.out.println(grid.toString());
                grids.add(grid);
            }
            return grids;
        }
        return null;
    }

    private String generateInventoryNum() {
        DecimalFormat df = new DecimalFormat("000000");
        String str = df.format(godownEntryService.countAll());
        return "K" + str;
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
