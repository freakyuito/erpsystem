package cn.overseachem.erp.pojo;

public class GodownEntrySpec {
    private Integer specId;

    private String fkBatchNum;

    private String fkInventoryNum;

    private Integer finishedQuantity;

    private Float finishedWeight;

    private Integer inventoryQuantity;

    private Float inventoryWeight;

    private Float wasteWeight;

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getFkBatchNum() {
        return fkBatchNum;
    }

    public void setFkBatchNum(String fkBatchNum) {
        this.fkBatchNum = fkBatchNum == null ? null : fkBatchNum.trim();
    }

    public String getFkInventoryNum() {
        return fkInventoryNum;
    }

    public void setFkInventoryNum(String fkInventoryNum) {
        this.fkInventoryNum = fkInventoryNum == null ? null : fkInventoryNum.trim();
    }

    public Integer getFinishedQuantity() {
        return finishedQuantity;
    }

    public void setFinishedQuantity(Integer finishedQuantity) {
        this.finishedQuantity = finishedQuantity;
    }

    public Float getFinishedWeight() {
        return finishedWeight;
    }

    public void setFinishedWeight(Float finishedWeight) {
        this.finishedWeight = finishedWeight;
    }

    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public Float getInventoryWeight() {
        return inventoryWeight;
    }

    public void setInventoryWeight(Float inventoryWeight) {
        this.inventoryWeight = inventoryWeight;
    }

    public Float getWasteWeight() {
        return wasteWeight;
    }

    public void setWasteWeight(Float wasteWeight) {
        this.wasteWeight = wasteWeight;
    }
}