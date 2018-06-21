package cn.overseachem.erp.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userPhone;

    private String realName;

    private String fkAuthoritiesId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getFkAuthoritiesId() {
        return fkAuthoritiesId;
    }

    public void setFkAuthoritiesId(String fkAuthoritiesId) {
        this.fkAuthoritiesId = fkAuthoritiesId == null ? null : fkAuthoritiesId.trim();
    }
}