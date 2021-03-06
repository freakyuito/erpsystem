package cn.overseachem.erp.pojo;

public class ProductOrderLstGrid {
    private Boolean validity;

    public ProductOrderLstGrid(Boolean validity, String purchaseNum, String patternName, String productNum, String machineNum, Integer completedAmount, Integer totalAmount, String estimateWeight, String deliverTime, String scheduleBeginTime, String scheduleFinishTime) {
        this.validity = validity;
        this.purchaseNum = purchaseNum;
        this.patternName = patternName;
        this.productNum = productNum;
        this.machineNum = machineNum;
        this.completedAmount = completedAmount;
        this.totalAmount = totalAmount;
        this.estimateWeight = estimateWeight;
        this.deliverTime = deliverTime;
        this.scheduleBeginTime = scheduleBeginTime;
        this.scheduleFinishTime = scheduleFinishTime;
    }

    private String purchaseNum;
    private String patternName;
    private String productNum;
    private String machineNum;
    private Integer completedAmount;
    private Integer totalAmount;
    private String estimateWeight;
    private String deliverTime;
    private String scheduleBeginTime;
    private String scheduleFinishTime;

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }

    public String getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getPurchaseNum() {
        return purchaseNum;
    }

    @Override
    public String toString() {
        return "ProductOrderLstGrid{" +
                "purchaseNum='" + purchaseNum + '\'' +
                ", patternName='" + patternName + '\'' +
                ", productNum='" + productNum + '\'' +
                ", machineNum=" + machineNum +
                ", completedAmount=" + completedAmount +
                ", totalAmount=" + totalAmount +
                ", estimateWeight=" + estimateWeight +
                ", scheduleBeginTime='" + scheduleBeginTime + '\'' +
                ", scheduleFinishTime='" + scheduleFinishTime + '\'' +
                '}';
    }

    public void setPurchaseNum(String purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public String getPatternName() {
        return patternName;
    }

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(String machineNum) {
        this.machineNum = machineNum;
    }

    public Integer getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(Integer completedAmount) {
        this.completedAmount = completedAmount;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getEstimateWeight() {
        return estimateWeight;
    }

    public void setEstimateWeight(String estimateWeight) {
        this.estimateWeight = estimateWeight;
    }

    public String getScheduleBeginTime() {
        return scheduleBeginTime;
    }

    public void setScheduleBeginTime(String scheduleBeginTime) {
        this.scheduleBeginTime = scheduleBeginTime;
    }

    public String getScheduleFinishTime() {
        return scheduleFinishTime;
    }

    public void setScheduleFinishTime(String scheduleFinishTime) {
        this.scheduleFinishTime = scheduleFinishTime;
    }
}
