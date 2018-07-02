package cn.overseachem.erp.pojo;

public class Machine {
    private Integer machineId;

    private String operateBatchNum;

    private Integer operateGroupId;

    private String fkOperationRecordsId;

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getOperateBatchNum() {
        return operateBatchNum;
    }

    public void setOperateBatchNum(String operateBatchNum) {
        this.operateBatchNum = operateBatchNum == null ? null : operateBatchNum.trim();
    }

    public Integer getOperateGroupId() {
        return operateGroupId;
    }

    public void setOperateGroupId(Integer operateGroupId) {
        this.operateGroupId = operateGroupId;
    }

    public String getFkOperationRecordsId() {
        return fkOperationRecordsId;
    }

    public void setFkOperationRecordsId(String fkOperationRecordsId) {
        this.fkOperationRecordsId = fkOperationRecordsId == null ? null : fkOperationRecordsId.trim();
    }
}