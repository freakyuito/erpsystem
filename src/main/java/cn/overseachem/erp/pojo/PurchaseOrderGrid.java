package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/15.
 */
public class PurchaseOrderGrid {

    private String purchaseNum;
    private String customerName;
    private String purchaseTime;
    private String deliverTime;
    private String contractId;
    private Boolean validityCode;
    private String remark;
    private String supervisorName;
    private String salesmanName;
    private String producerName;
    private String makerName;

    public PurchaseOrderGrid(String purchaseNum, String customerName, String purchaseTime, String deliverTime, String contractId, Boolean validityCode, String remark, String supervisorName, String salesmanName, String producerName, String makerName) {
        this.purchaseNum = purchaseNum;
        this.customerName = customerName;
        this.purchaseTime = purchaseTime;
        this.deliverTime = deliverTime;
        this.contractId = contractId;
        this.validityCode = validityCode;
        this.remark = remark;
        this.supervisorName = supervisorName;
        this.salesmanName = salesmanName;
        this.producerName = producerName;
        this.makerName = makerName;
    }

    public String getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(String purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Boolean getValidityCode() {
        return validityCode;
    }

    public void setValidityCode(Boolean validityCode) {
        this.validityCode = validityCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
}
