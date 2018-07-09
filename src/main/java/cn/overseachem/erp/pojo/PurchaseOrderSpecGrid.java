package cn.overseachem.erp.pojo;

/**
 * Created by Zhihui_Shen on 2018/6/11.
 */
public class PurchaseOrderSpecGrid {
    private String patternName;
    private String colorName;
    private Integer length;
    private Integer width;
    private Float thickness;
    private Integer amount;
    private String completedAmount;
    private String requiredAmount;
    private Float estimateWeight;
    private Float weight;
    private Float price;
    private Float totalPrice;

    @Override
    public String toString() {
        return "PurchaseOrderSpecGrid{" +
                "patternName='" + patternName + '\'' +
                ", colorName='" + colorName + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", thickness=" + thickness +
                ", amount=" + amount +
                ", completedAmount='" + completedAmount + '\'' +
                ", requiredAmount='" + requiredAmount + '\'' +
                ", estimateWeight=" + estimateWeight +
                ", weight=" + weight +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public String getPatternName() {
        return patternName;
    }

    public void setPatternName(String patternName) {
        this.patternName = patternName;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(String completedAmount) {
        this.completedAmount = completedAmount;
    }

    public String getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(String requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public Float getEstimateWeight() {
        return estimateWeight;
    }

    public void setEstimateWeight(Float estimateWeight) {
        this.estimateWeight = estimateWeight;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PurchaseOrderSpecGrid(String patternName, String colorName, Integer length, Integer width, Float thickness, Integer amount, String completedAmount, String requiredAmount, Float estimateWeight, Float weight, Float price, Float totalPrice) {

        this.patternName = patternName;
        this.colorName = colorName;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.amount = amount;
        this.completedAmount = completedAmount;
        this.requiredAmount = requiredAmount;
        this.estimateWeight = estimateWeight;
        this.weight = weight;
        this.price = price;
        this.totalPrice = totalPrice;
    }
}
