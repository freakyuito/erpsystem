package cn.overseachem.erp.pojo;

public class Contract {
    private String contractId;

    private String fkPurchaseNum;

    private byte[] contractFile;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getFkPurchaseNum() {
        return fkPurchaseNum;
    }

    public void setFkPurchaseNum(String fkPurchaseNum) {
        this.fkPurchaseNum = fkPurchaseNum == null ? null : fkPurchaseNum.trim();
    }

    public byte[] getContractFile() {
        return contractFile;
    }

    public void setContractFile(byte[] contractFile) {
        this.contractFile = contractFile;
    }
}