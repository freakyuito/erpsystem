package cn.overseachem.erp.pojo;

public class GodownEntrySpecDtlGrid {
    private String purchaseNum;
    private String colorName;
    private String batchNum;
    private String size;
    private String finishedQty;
    private String finishedWgt;
    private String inventoryQty;
    private String inventoryWgt;
    private String wasteWgt;

    @Override
    public String toString() {
        return "GodownEntrySpecDtlGrid{" +
                "purchaseNum='" + purchaseNum + '\'' +
                ", colorName='" + colorName + '\'' +
                ", batchNum='" + batchNum + '\'' +
                ", size='" + size + '\'' +
                ", finishedQty='" + finishedQty + '\'' +
                ", finishedWgt='" + finishedWgt + '\'' +
                ", inventoryQty='" + inventoryQty + '\'' +
                ", inventoryWgt='" + inventoryWgt + '\'' +
                ", wasteWgt='" + wasteWgt + '\'' +
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

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFinishedQty() {
        return finishedQty;
    }

    public void setFinishedQty(String finishedQty) {
        this.finishedQty = finishedQty;
    }

    public String getFinishedWgt() {
        return finishedWgt;
    }

    public void setFinishedWgt(String finishedWgt) {
        this.finishedWgt = finishedWgt;
    }

    public String getInventoryQty() {
        return inventoryQty;
    }

    public void setInventoryQty(String inventoryQty) {
        this.inventoryQty = inventoryQty;
    }

    public String getInventoryWgt() {
        return inventoryWgt;
    }

    public void setInventoryWgt(String inventoryWgt) {
        this.inventoryWgt = inventoryWgt;
    }

    public String getWasteWgt() {
        return wasteWgt;
    }

    public void setWasteWgt(String wasteWgt) {
        this.wasteWgt = wasteWgt;
    }

    public GodownEntrySpecDtlGrid(String purchaseNum, String colorName, String batchNum, String size, String finishedQty, String finishedWgt, String inventoryQty, String inventoryWgt, String wasteWgt) {

        this.purchaseNum = purchaseNum;
        this.colorName = colorName;
        this.batchNum = batchNum;
        this.size = size;
        this.finishedQty = finishedQty;
        this.finishedWgt = finishedWgt;
        this.inventoryQty = inventoryQty;
        this.inventoryWgt = inventoryWgt;
        this.wasteWgt = wasteWgt;
    }
}
