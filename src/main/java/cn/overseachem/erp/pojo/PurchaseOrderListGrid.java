package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/11.
 */
public class PurchaseOrderListGrid {
    private Boolean validity;

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }

    public PurchaseOrderListGrid(Boolean validity, String customerName, String purchaseNum, Integer completedAmout, Integer totalAmout, String purchaseTime, String deliverTime, String remark) {

        this.validity = validity;
        this.customerName = customerName;
        this.purchaseNum = purchaseNum;
        this.completedAmout = completedAmout;
        this.totalAmout = totalAmout;
        this.purchaseTime = purchaseTime;
        this.deliverTime = deliverTime;
        this.remark = remark;
    }

    private String customerName;
    private String purchaseNum;
    private Integer completedAmout;
    private Integer totalAmout;
    private String purchaseTime;
    private String deliverTime;
    private String remark;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(String purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public Integer getCompletedAmout() {
        return completedAmout;
    }

    public void setCompletedAmout(Integer completedAmout) {
        this.completedAmout = completedAmout;
    }

    public Integer getTotalAmout() {
        return totalAmout;
    }

    public void setTotalAmout(Integer totalAmout) {
        this.totalAmout = totalAmout;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public PurchaseOrderListGrid(String customerName, String purchaseNum, Integer completedAmout, Integer totalAmout, String purchaseTime, String deliverTime, String remark) {
        this.customerName = customerName;
        this.purchaseNum = purchaseNum;
        this.completedAmout = completedAmout;
        this.totalAmout = totalAmout;
        this.purchaseTime = purchaseTime;
        this.deliverTime = deliverTime;
        if (remark == null) {
            this.remark = "——";
        } else {
            this.remark = remark;
        }
    }
}
