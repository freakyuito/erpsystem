package cn.overseachem.erp.pojo;

public class PurchaseOrderSpec {
    private Integer specId;

    private String fkPurchaseNum;

    private String patternId;

    private String colorId;

    private Integer length;

    private Integer width;

    private Float thickness;

    private Integer requiredAmount;

    private Float price;

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getFkPurchaseNum() {
        return fkPurchaseNum;
    }

    public void setFkPurchaseNum(String fkPurchaseNum) {
        this.fkPurchaseNum = fkPurchaseNum == null ? null : fkPurchaseNum.trim();
    }

    public String getPatternId() {
        return patternId;
    }

    public void setPatternId(String patternId) {
        this.patternId = patternId == null ? null : patternId.trim();
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId == null ? null : colorId.trim();
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

    public Integer getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(Integer requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}