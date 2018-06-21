package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/19.
 */
public class PlateCraftDtlGrid {
    private String colorName;
    private String meteringPumpRevs;
    private String masterBatchRevs;
    private String masterBatchBrand;
    private String membraneName;
    private String embossingName;

    @Override
    public String toString() {
        return "PlateCraftDtlGrid{" +
                "colorName='" + colorName + '\'' +
                ", meteringPumpRevs=" + meteringPumpRevs +
                ", masterBatchRevs=" + masterBatchRevs +
                ", masterBatchBrand=" + masterBatchBrand +
                ", membraneName='" + membraneName + '\'' +
                ", embossingName='" + embossingName + '\'' +
                '}';
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getMeteringPumpRevs() {
        return meteringPumpRevs;
    }

    public void setMeteringPumpRevs(String meteringPumpRevs) {
        this.meteringPumpRevs = meteringPumpRevs;
    }

    public String getMasterBatchRevs() {
        return masterBatchRevs;
    }

    public void setMasterBatchRevs(String masterBatchRevs) {
        this.masterBatchRevs = masterBatchRevs;
    }

    public String getMasterBatchBrand() {
        return masterBatchBrand;
    }

    public void setMasterBatchBrand(String masterBatchBrand) {
        this.masterBatchBrand = masterBatchBrand;
    }

    public String getMembraneName() {
        return membraneName;
    }

    public void setMembraneName(String membraneName) {
        this.membraneName = membraneName;
    }

    public String getEmbossingName() {
        return embossingName;
    }

    public void setEmbossingName(String embossingName) {
        this.embossingName = embossingName;
    }

    public PlateCraftDtlGrid(String colorName, String meteringPumpRevs, String masterBatchRevs, String masterBatchBrand, String membraneName, String embossingName) {

        this.colorName = colorName;
        this.meteringPumpRevs = meteringPumpRevs;
        this.masterBatchRevs = masterBatchRevs;
        this.masterBatchBrand = masterBatchBrand;
        this.membraneName = membraneName;
        this.embossingName = embossingName;
    }
}
