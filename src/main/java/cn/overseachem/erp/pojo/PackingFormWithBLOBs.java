package cn.overseachem.erp.pojo;

public class PackingFormWithBLOBs extends PackingForm {
    private String finishedList;

    private String wasteList;

    private String inventoryList;

    public String getFinishedList() {
        return finishedList;
    }

    public void setFinishedList(String finishedList) {
        this.finishedList = finishedList == null ? null : finishedList.trim();
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