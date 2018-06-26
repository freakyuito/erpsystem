package cn.overseachem.erp.pojo;

import java.util.ArrayList;

public class PackingFormDtlGrid {
    private String purchaseNum;
    private String colorName;
    private String batchNum;
    private String size;
    private String packingNum;
    private ArrayList<PackingFormDataItem> weighingList = new ArrayList<PackingFormDataItem>();
    private ArrayList<PackingFormDataItem> wasteList = new ArrayList<PackingFormDataItem>();
    private ArrayList<PackingFormDataItem> inventoryList = new ArrayList<PackingFormDataItem>();

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

    public ArrayList<PackingFormDataItem> getWeighingList() {
        return weighingList;
    }

    public void setWeighingList(ArrayList<PackingFormDataItem> weighingList) {
        this.weighingList = weighingList;
    }

    public ArrayList<PackingFormDataItem> getWasteList() {
        return wasteList;
    }

    public void setWasteList(ArrayList<PackingFormDataItem> wasteList) {
        this.wasteList = wasteList;
    }

    public ArrayList<PackingFormDataItem> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<PackingFormDataItem> inventoryList) {
        this.inventoryList = inventoryList;
    }
}
