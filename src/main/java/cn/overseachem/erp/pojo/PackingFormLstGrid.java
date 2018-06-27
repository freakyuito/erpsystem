package cn.overseachem.erp.pojo;

public class PackingFormLstGrid {
    private String purchaseNum;
    private String colorName;
    private String batchNum;
    private String machineId;
    private String size;
    private String requiredAmount;
    private String completedWeight;
    private String packingNum;

    @Override
    public String toString() {
        return "PackingFormLstGrid{" +
                "purchaseNum='" + purchaseNum + '\'' +
                ", colorName='" + colorName + '\'' +
                ", batchNum='" + batchNum + '\'' +
                ", machineId='" + machineId + '\'' +
                ", size='" + size + '\'' +
                ", requiredAmount='" + requiredAmount + '\'' +
                ", completedWeight='" + completedWeight + '\'' +
                ", packingNum='" + packingNum + '\'' +
                '}';
    }

    public PackingFormLstGrid(String purchaseNum, String colorName, String batchNum, String machineId, String size, String requiredAmount, String completedWeight, String packingNum) {
        this.purchaseNum = purchaseNum;
        this.colorName = colorName;
        this.batchNum = batchNum;
        this.machineId = machineId;
        this.size = size;
        this.requiredAmount = requiredAmount;
        this.completedWeight = completedWeight;
        this.packingNum = packingNum;
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

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(String requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public String getCompletedWeight() {
        return completedWeight;
    }

    public void setCompletedWeight(String completedWeight) {
        this.completedWeight = completedWeight;
    }

    public String getPackingNum() {
        return packingNum;
    }

    public void setPackingNum(String packingNum) {
        this.packingNum = packingNum;
    }
}
