package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/19.
 */
public class ProductOrderDtlGrid {
    private String purchaseNum;
    private String colorName;
    private Integer machineNum;
    private String productNum;
    private Boolean isChecked;
    private String approvorName;
    private String receiverName;

    public ProductOrderDtlGrid(String purchaseNum, String colorName, Integer machineNum, String productNum, Boolean isChecked, String approvorName, String receiverName) {
        this.purchaseNum = purchaseNum;
        this.colorName = colorName;
        this.machineNum = machineNum;
        this.productNum = productNum;
        this.isChecked = isChecked;
        this.approvorName = approvorName;
        this.receiverName = receiverName;
    }

    public String getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(String purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public String getPatternName() {
        return colorName;
    }

    public void setPatternName(String patternName) {
        this.colorName = patternName;
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
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
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

    @Override
    public String toString() {
        return "ProductOrderDtlGrid{" +
                "purchaseNum='" + purchaseNum + '\'' +
                ", colorName='" + colorName + '\'' +
                ", machineNum=" + machineNum +
                ", productNum='" + productNum + '\'' +
                ", isChecked=" + isChecked +
                ", approvorName='" + approvorName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                '}';
    }
}
