package cn.overseachem.erp.pojo;

public class PackingFormWeighingList {
    private String index;
    private String quantity;
    private String weight;

    @Override
    public String toString() {
        return "PackingFormWeighingList{" +
                "index=" + index +
                ", quantity='" + quantity + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public PackingFormWeighingList(String index, String quantity, String weight) {
        this.index = index;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getIndex() {

        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
