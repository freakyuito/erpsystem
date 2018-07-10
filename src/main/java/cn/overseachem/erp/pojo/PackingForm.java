package cn.overseachem.erp.pojo;

public class PackingForm {
    private String packingNum;

    private String fkBatchNum;

    private String finishedRecords;

    private String wasteRecords;

    private String inventoryRecords;

    private String printRecords;

    private String fkOperationRecordsId;

    public String getPackingNum() {
        return packingNum;
    }

    public void setPackingNum(String packingNum) {
        this.packingNum = packingNum == null ? null : packingNum.trim();
    }

    public String getFkBatchNum() {
        return fkBatchNum;
    }

    public void setFkBatchNum(String fkBatchNum) {
        this.fkBatchNum = fkBatchNum == null ? null : fkBatchNum.trim();
    }

    public String getFinishedRecords() {
        return finishedRecords;
    }

    public void setFinishedRecords(String finishedRecords) {
        this.finishedRecords = finishedRecords == null ? null : finishedRecords.trim();
    }

    public String getWasteRecords() {
        return wasteRecords;
    }

    public void setWasteRecords(String wasteRecords) {
        this.wasteRecords = wasteRecords == null ? null : wasteRecords.trim();
    }

    public String getInventoryRecords() {
        return inventoryRecords;
    }

    public void setInventoryRecords(String inventoryRecords) {
        this.inventoryRecords = inventoryRecords == null ? null : inventoryRecords.trim();
    }

    public String getPrintRecords() {
        return printRecords;
    }

    public void setPrintRecords(String printRecords) {
        this.printRecords = printRecords == null ? null : printRecords.trim();
    }

    public String getFkOperationRecordsId() {
        return fkOperationRecordsId;
    }

    public void setFkOperationRecordsId(String fkOperationRecordsId) {
        this.fkOperationRecordsId = fkOperationRecordsId == null ? null : fkOperationRecordsId.trim();
    }
}