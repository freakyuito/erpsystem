package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/19.
 */
public class ProductOrderSpecDtlGrid {
    private String colorName;
    private Integer length;
    private Integer width;
    private Float thickness;
    private Integer completedAmount;
    private Integer requireAmount;
    private Float estimateWeight;
    private String batchNum;
    private Integer stateCode;

    public ProductOrderSpecDtlGrid(String colorName, Integer length, Integer width, Float thickness, Integer completedAmount, Integer requireAmount, Float estimateWeight, String batchNum, Integer stateCode) {
        this.colorName = colorName;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.completedAmount = completedAmount;
        this.requireAmount = requireAmount;
        this.estimateWeight = estimateWeight;
        this.batchNum = batchNum;
        this.stateCode = stateCode;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Float getThickness() {
        return thickness;
    }

    public void setThickness(Float thickness) {
        this.thickness = thickness;
    }

    public Integer getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(Integer completedAmount) {
        this.completedAmount = completedAmount;
    }

    public Integer getRequireAmount() {
        return requireAmount;
    }

    public void setRequireAmount(Integer requireAmount) {
        this.requireAmount = requireAmount;
    }

    public Float getEstimateWeight() {
        return estimateWeight;
    }

    public void setEstimateWeight(Float estimateWeight) {
        this.estimateWeight = estimateWeight;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public Integer getStateCode() {
        return stateCode;
    }

    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }
}
