package cn.overseachem.erp.pojo;

public class Pattern {
    private String patternId;

    private String patternName;

    public String getPatternId() {
        return patternId;
    }

    public void setPatternId(String patternId) {
        this.patternId = patternId == null ? null : patternId.trim();
    }

    public String getPatternName() {
        return patternName;
    }

    public void setPatternName(String patternName) {
        this.patternName = patternName == null ? null : patternName.trim();
    }
}