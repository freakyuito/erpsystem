package cn.overseachem.erp.pojo;

public class GodownEntryLstGrid {
    private String generateTime;
    private String inventoryNum;
    private String machinId;
    private String workgroup;
    private String monitorName;
    private String commanderName;
    private String inspectorName;
    private String recorderName;
    private String material;
    private String finishedRate;
    private String finishedQty;
    private String finishedWgt;
    private String wasteWgt;

    public GodownEntryLstGrid() {

    }

    @Override
    public String toString() {
        return "GodownEntryLstGrid{" +
                "generateTime='" + generateTime + '\'' +
                ", inventoryNum='" + inventoryNum + '\'' +
                ", machinId='" + machinId + '\'' +
                ", workgroup='" + workgroup + '\'' +
                ", monitorName='" + monitorName + '\'' +
                ", commanderName='" + commanderName + '\'' +
                ", inspectorName='" + inspectorName + '\'' +
                ", recorderName='" + recorderName + '\'' +
                ", material='" + material + '\'' +
                ", finishedRate='" + finishedRate + '\'' +
                ", finishedQty='" + finishedQty + '\'' +
                ", finishedWgt='" + finishedWgt + '\'' +
                ", wasteWgt='" + wasteWgt + '\'' +
                '}';
    }

    public String getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
    }

    public String getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(String inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    public String getMachinId() {
        return machinId;
    }

    public void setMachinId(String machinId) {
        this.machinId = machinId;
    }

    public String getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(String workgroup) {
        this.workgroup = workgroup;
    }

    public String getMonitorName() {
        return monitorName;
    }

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    public String getCommanderName() {
        return commanderName;
    }

    public void setCommanderName(String commanderName) {
        this.commanderName = commanderName;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    public String getRecorderName() {
        return recorderName;
    }

    public void setRecorderName(String recorderName) {
        this.recorderName = recorderName;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFinishedRate() {
        return finishedRate;
    }

    public void setFinishedRate(String finishedRate) {
        this.finishedRate = finishedRate;
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

    public String getWasteWgt() {
        return wasteWgt;
    }

    public void setWasteWgt(String wasteWgt) {
        this.wasteWgt = wasteWgt;
    }

    public GodownEntryLstGrid(String generateTime, String inventoryNum, String machinId, String workgroup, String monitorName, String commanderName, String inspectorName, String recorderName, String material, String finishedRate, String finishedQty, String finishedWgt, String wasteWgt) {

        this.generateTime = generateTime;
        this.inventoryNum = inventoryNum;
        this.machinId = machinId;
        this.workgroup = workgroup;
        this.monitorName = monitorName;
        this.commanderName = commanderName;
        this.inspectorName = inspectorName;
        this.recorderName = recorderName;
        this.material = material;
        this.finishedRate = finishedRate;
        this.finishedQty = finishedQty;
        this.finishedWgt = finishedWgt;
        this.wasteWgt = wasteWgt;
    }
}
