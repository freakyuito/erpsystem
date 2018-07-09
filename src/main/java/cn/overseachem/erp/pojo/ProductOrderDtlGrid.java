package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/19.
 */
public class ProductOrderDtlGrid {
    private Boolean validity;

    @Override
    public String toString() {
        return "ProductOrderDtlGrid{" +
                "validity=" + validity +
                ", purchaseNum='" + purchaseNum + '\'' +
                ", patternName='" + patternName + '\'' +
                ", machineNum=" + machineNum +
                ", productNum='" + productNum + '\'' +
                ", checked=" + checked +
                ", approvorName='" + approvorName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", begin=" + begin +
                '}';
    }

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }

    public ProductOrderDtlGrid(Boolean validity, String purchaseNum, String patternName, Integer machineNum, String productNum, Boolean checked, String approvorName, String receiverName, Boolean begin) {

        this.validity = validity;
        this.purchaseNum = purchaseNum;
        this.patternName = patternName;
        this.machineNum = machineNum;
        this.productNum = productNum;
        this.checked = checked;
        this.approvorName = approvorName;
        this.receiverName = receiverName;
        this.begin = begin;
    }

    private String purchaseNum;
    private String patternName;
    private Integer machineNum;
    private String productNum;
    private Boolean checked;
    private String approvorName;
    private String receiverName;
    private Boolean begin;

    public String getPurchaseNum() {
        return purchaseNum;
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

    public Integer getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(Integer machineNum) {
        this.machineNum = machineNum;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getApprovorName() {
        return approvorName;
    }

    public void setApprovorName(String approvorName) {
        this.approvorName = approvorName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public Boolean getBegin() {
        return begin;
    }

    public void setBegin(Boolean begin) {
        this.begin = begin;
    }
}
