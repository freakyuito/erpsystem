package cn.overseachem.erp.pojo;

public class ProductOrderSpec {
    private String batchNum;

    private String fkProductNum;

    private Integer stateCode;

    private Integer completedAmount;

    private Integer fkPurchaseSpecId;

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum == null ? null : batchNum.trim();
    }

    public String getFkProductNum() {
        return fkProductNum;
    }

    public void setFkProductNum(String fkProductNum) {
        this.fkProductNum = fkProductNum == null ? null : fkProductNum.trim();
    }

    public Integer getStateCode() {
        return stateCode;
    }

    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }

    public Integer getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(Integer completedAmount) {
        this.completedAmount = completedAmount;
    }

    public Integer getFkPurchaseSpecId() {
        return fkPurchaseSpecId;
    }

    public void setFkPurchaseSpecId(Integer fkPurchaseSpecId) {
        this.fkPurchaseSpecId = fkPurchaseSpecId;
    }

    @Override
    public String toString() {
        return "ProductOrderSpec{" +
                "batchNum='" + batchNum + '\'' +
                ", fkProductNum='" + fkProductNum + '\'' +
                ", stateCode=" + stateCode +
                ", completedAmount=" + completedAmount +
                ", fkPurchaseSpecId=" + fkPurchaseSpecId +
                '}';
    }
}