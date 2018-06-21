package cn.overseachem.erp.pojo;

import java.util.Date;

public class ProductOrder {
    private String productNum;

    private String fkPurchaseNum;

    private Integer machineNum;

    private Integer receiverId;

    private Date generateTime;

    private Date scheduleBeginTime;

    private Date scheduleFinishTime;

    private Integer approverId;

    private String fkOperationRecordsId;

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }

    public String getFkPurchaseNum() {
        return fkPurchaseNum;
    }

    public void setFkPurchaseNum(String fkPurchaseNum) {
        this.fkPurchaseNum = fkPurchaseNum == null ? null : fkPurchaseNum.trim();
    }

    public Integer getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(Integer machineNum) {
        this.machineNum = machineNum;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Date getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    public Date getScheduleBeginTime() {
        return scheduleBeginTime;
    }

    public void setScheduleBeginTime(Date scheduleBeginTime) {
        this.scheduleBeginTime = scheduleBeginTime;
    }

    public Date getScheduleFinishTime() {
        return scheduleFinishTime;
    }

    public void setScheduleFinishTime(Date scheduleFinishTime) {
        this.scheduleFinishTime = scheduleFinishTime;
    }

    public Integer getApproverId() {
        return approverId;
    }

    public void setApproverId(Integer approverId) {
        this.approverId = approverId;
    }

    public String getFkOperationRecordsId() {
        return fkOperationRecordsId;
    }

    public void setFkOperationRecordsId(String fkOperationRecordsId) {
        this.fkOperationRecordsId = fkOperationRecordsId == null ? null : fkOperationRecordsId.trim();
    }
}