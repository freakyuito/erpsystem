package cn.overseachem.erp.pojo;

import java.util.Date;

public class GodownEntry {
    private String inventoryNum;

    private Date generateTime;

    private Integer commanderId;

    private Integer recorderId;

    private Integer inspectorId;

    private Integer monitorId;

    private Integer workgroupId;

    private String fkOperationRecordsId;

    private Integer machineId;

    public String getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(String inventoryNum) {
        this.inventoryNum = inventoryNum == null ? null : inventoryNum.trim();
    }

    public Date getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    public Integer getCommanderId() {
        return commanderId;
    }

    public void setCommanderId(Integer commanderId) {
        this.commanderId = commanderId;
    }

    public Integer getRecorderId() {
        return recorderId;
    }

    public void setRecorderId(Integer recorderId) {
        this.recorderId = recorderId;
    }

    public Integer getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(Integer inspectorId) {
        this.inspectorId = inspectorId;
    }

    public Integer getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(Integer monitorId) {
        this.monitorId = monitorId;
    }

    public Integer getWorkgroupId() {
        return workgroupId;
    }

    public void setWorkgroupId(Integer workgroupId) {
        this.workgroupId = workgroupId;
    }

    public String getFkOperationRecordsId() {
        return fkOperationRecordsId;
    }

    public void setFkOperationRecordsId(String fkOperationRecordsId) {
        this.fkOperationRecordsId = fkOperationRecordsId == null ? null : fkOperationRecordsId.trim();
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }
}