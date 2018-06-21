package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/19.
 */
public class ProductOrderSpecDtlGrid {
    private String patternName;
    private Integer length;
    private Integer width;
    private Float thickness;
    private Integer completedAmount;
    private Integer requiredAmount;
    private Float estimateWeight;
    private String batchNum;
    private Integer stateCode;

    @Override
    public String toString() {
        return "ProductOrderSpecDtlGrid{" +
                "patternName='" + patternName + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", thickness=" + thickness +
                ", completedAmount=" + completedAmount +
                ", requiredAmount=" + requiredAmount +
                ", estimateWeight=" + estimateWeight +
                ", batchNum='" + batchNum + '\'' +
                ", stateCode=" + stateCode +
                '}';
    }

    public String getPatternName() {
        return patternName;
    }

    public void setPatternName(String patternName) {
        this.patternName = patternName;
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

    public Integer getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(Integer requiredAmount) {
        this.requiredAmount = requiredAmount;
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

    public ProductOrderSpecDtlGrid(String patternName, Integer length, Integer width, Float thickness, Integer completedAmount, Integer requiredAmount, Float estimateWeight, String batchNum, Integer stateCode) {

        this.patternName = patternName;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.completedAmount = completedAmount;
        this.requiredAmount = requiredAmount;
        this.estimateWeight = estimateWeight;
        this.batchNum = batchNum;
        this.stateCode = stateCode;
    }
}
