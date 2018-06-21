package cn.overseachem.erp.pojo;

import java.util.Date;

public class ProductOrderLstGrid {
    private String purchaseNum;
    private String colorName;
    private String productNum;
    private Integer machineNum;
    private Integer completedAmount;
    private Integer totalAmount;
    private Float estimateWeight;
    private String scheduleBeginTime;
    private String scheduleFinishTime;

    public ProductOrderLstGrid(String purchaseNum, String colorName, String productNum, Integer machineNum, Integer completedAmount, Integer totalAmount, Float estimateWeight, String scheduleBeginTime, String scheduleFinishTime) {
        this.purchaseNum = purchaseNum;
        this.colorName = colorName;
        this.productNum = productNum;
        this.machineNum = machineNum;
        this.completedAmount = completedAmount;
        this.totalAmount = totalAmount;
        this.estimateWeight = estimateWeight;
        this.scheduleBeginTime = scheduleBeginTime;
        this.scheduleFinishTime = scheduleFinishTime;
    }

    public String getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(String purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public Integer getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(Integer machineNum) {
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

    public Float getEstimateWeight() {
        return estimateWeight;
    }

    public void setEstimateWeight(Float estimateWeight) {
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

    @Override
    public String toString() {
        return "ProductOrderLstGrid{" +
                "purchaseNum='" + purchaseNum + '\'' +
                ", colorName='" + colorName + '\'' +
                ", productNum='" + productNum + '\'' +
                ", machineNum=" + machineNum +
                ", completedAmount=" + completedAmount +
                ", totalAmount=" + totalAmount +
                ", estimateWeight=" + estimateWeight +
                ", scheduleBeginTime='" + scheduleBeginTime + '\'' +
                ", scheduleFinishTime='" + scheduleFinishTime + '\'' +
                '}';
    }
}
