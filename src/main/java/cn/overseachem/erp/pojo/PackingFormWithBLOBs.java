package cn.overseachem.erp.pojo;

public class PackingFormWithBLOBs extends PackingForm {
    private String weighingList;

    private String wasteList;

    private String inventoryList;

    public String getWeighingList() {
        return weighingList;
    }

    public void setWeighingList(String weighingList) {
        this.weighingList = weighingList == null ? null : weighingList.trim();
    }

    public String getWasteList() {
        return wasteList;
    }

    public void setWasteList(String wasteList) {
        this.wasteList = wasteList == null ? null : wasteList.trim();
    }

    public String getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(String inventoryList) {
        this.inventoryList = inventoryList == null ? null : inventoryList.trim();
    }
}