package cn.overseachem.erp.pojo;

public class PackingFormDataItem {
    private String index;
    private String key;
    private String value;

    @Override
    public String toString() {
        return "PackingFormDataItem{" +
                "index='" + index + '\'' +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PackingFormDataItem(String index, String key, String value) {

        this.index = index;
        this.key = key;
        this.value = value;
    }
}
