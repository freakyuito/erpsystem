package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/19.
 */
public class ProductOrderDtlGrid {
    private String purchaseNum;
    private String colorName;
    private Integer machineNum;
    private String productNum;
    private Boolean checked;
    private String approvorName;
    private String receiverName;
    private Boolean begin;

    public ProductOrderDtlGrid(String purchaseNum, String colorName, Integer machineNum, String productNum, Boolean checked, String approvorName, String receiverName, Boolean isBegin) {
        this.purchaseNum = purchaseNum;
        this.colorName = colorName;
        this.machineNum = machineNum;
        this.productNum = productNum;
        this.checked = checked;
        this.approvorName = approvorName;
        this.receiverName = receiverName;
        this.begin = isBegin;
    }

    @Override
    public String toString() {
        return "ProductOrderDtlGrid{" +
                "purchaseNum='" + purchaseNum + '\'' +
                ", colorName='" + colorName + '\'' +
                ", machineNum=" + machineNum +
                ", productNum='" + productNum + '\'' +
                ", isChecked=" + checked +
                ", approvorName='" + approvorName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                '}';
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
        checked = checked;
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
        begin = begin;
    }
}
