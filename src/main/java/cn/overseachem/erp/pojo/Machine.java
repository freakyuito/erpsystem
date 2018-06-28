package cn.overseachem.erp.pojo;

public class Machine {
    private Integer machineId;

    private String occupiedBatchNum;

    private String fkOperationRecordsId;

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getOccupiedBatchNum() {
        return occupiedBatchNum;
    }

    public void setOccupiedBatchNum(String occupiedBatchNum) {
        this.occupiedBatchNum = occupiedBatchNum == null ? null : occupiedBatchNum.trim();
    }

    public String getFkOperationRecordsId() {
        return fkOperationRecordsId;
    }

    public void setFkOperationRecordsId(String fkOperationRecordsId) {
        this.fkOperationRecordsId = fkOperationRecordsId == null ? null : fkOperationRecordsId.trim();
    }
}