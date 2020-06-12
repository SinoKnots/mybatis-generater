package com.sino.pms.user.backgroup.ui.domain.po;

public class UserBasePO {
    private Long id;

    private String name;

    private String nickName;

    private String email;

    private String mobile;

    private String loginPassword;

    private String registerMode;

    private String registerTime;

    private String statu;

    private String isDeleted;

    private Byte pwdFailTimes;

    public UserBasePO(Long id, String name, String nickName, String email, String mobile, String loginPassword, String registerMode, String registerTime, String statu, String isDeleted, Byte pwdFailTimes) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.mobile = mobile;
        this.loginPassword = loginPassword;
        this.registerMode = registerMode;
        this.registerTime = registerTime;
        this.statu = statu;
        this.isDeleted = isDeleted;
        this.pwdFailTimes = pwdFailTimes;
    }

    public UserBasePO() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getRegisterMode() {
        return registerMode;
    }

    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode == null ? null : registerMode.trim();
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public Byte getPwdFailTimes() {
        return pwdFailTimes;
    }

    public void setPwdFailTimes(Byte pwdFailTimes) {
        this.pwdFailTimes = pwdFailTimes;
    }
}