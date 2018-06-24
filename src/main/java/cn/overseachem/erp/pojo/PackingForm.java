package cn.overseachem.erp.pojo;

public class PackingForm {
    private String packingNum;

    private String fkBatchNum;

    private String exchangeRecords;

    private String printRecords;

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

    public String getExchangeRecords() {
        return exchangeRecords;
    }

    public void setExchangeRecords(String exchangeRecords) {
        this.exchangeRecords = exchangeRecords == null ? null : exchangeRecords.trim();
    }

    public String getPrintRecords() {
        return printRecords;
    }

    public void setPrintRecords(String printRecords) {
        this.printRecords = printRecords == null ? null : printRecords.trim();
    }
}