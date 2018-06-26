package cn.overseachem.erp.pojo;

import java.util.ArrayList;

public class PackingFormDtlGrid {
    private String purchaseNum;
    private String colorName;
    private String batchNum;
    private String size;
    private String packingNum;
    private Boolean weighingListEmpty;

    public PackingFormDtlGrid(String purchaseNum, String colorName, String batchNum, String size, String packingNum, Boolean weighingListEmpty) {
        this.purchaseNum = purchaseNum;
        this.colorName = colorName;
        this.batchNum = batchNum;
        this.size = size;
        this.packingNum = packingNum;
        this.weighingListEmpty = weighingListEmpty;
    }

    public Boolean getWeighingListEmpty() {
        return weighingListEmpty;
    }

    public void setWeighingListEmpty(Boolean weighingListEmpty) {
        this.weighingListEmpty = weighingListEmpty;
    }

    public PackingFormDtlGrid() {
    }

    public PackingFormDtlGrid(String purchaseNum, String colorName, String batchNum, String size, String packingNum) {
        this.purchaseNum = purchaseNum;
        this.colorName = colorName;
        this.batchNum = batchNum;
        this.size = size;
        this.packingNum = packingNum;
    }

    @Override
    public String toString() {
        return "PackingFormDtlGrid{" +
                "purchaseNum='" + purchaseNum + '\'' +
                ", colorName='" + colorName + '\'' +
                ", batchNum='" + batchNum + '\'' +
                ", size='" + size + '\'' +
                ", packingNum='" + packingNum + '\'' +
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

    public String getPackingNum() {
        return packingNum;
    }

    public void setPackingNum(String packingNum) {
        this.packingNum = packingNum;
    }
}
