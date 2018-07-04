package cn.overseachem.erp.pojo;

public class GodownEntryDtlGrid {
    private String generateTime;
    private String machineId;
    private String workgroup;
    private String inventoryNum;
    private String monitorName;
    private String commanderName;
    private String inspectorName;
    private String recorderName;

    @Override
    public String toString() {
        return "GodownEntryDtlGrid{" +
                "generateTime='" + generateTime + '\'' +
                ", machineId='" + machineId + '\'' +
                ", workgroup='" + workgroup + '\'' +
                ", inventoryNum='" + inventoryNum + '\'' +
                ", monitorName='" + monitorName + '\'' +
                ", commanderName='" + commanderName + '\'' +
                ", inspectorName='" + inspectorName + '\'' +
                ", recorderName='" + recorderName + '\'' +
                '}';
    }

    public String getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(String workgroup) {
        this.workgroup = workgroup;
    }

    public String getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(String inventoryNum) {
        this.inventoryNum = inventoryNum;
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

    public GodownEntryDtlGrid(String generateTime, String machineId, String workgroup, String inventoryNum, String monitorName, String commanderName, String inspectorName, String recorderName) {

        this.generateTime = generateTime;
        this.machineId = machineId;
        this.workgroup = workgroup;
        this.inventoryNum = inventoryNum;
        this.monitorName = monitorName;
        this.commanderName = commanderName;
        this.inspectorName = inspectorName;
        this.recorderName = recorderName;
    }
}
