package com.sino.pms.user.backgroup.ui.domain.po;

public class UserLoginLogPO {
    private Long id;

    private Long userId;

    private String loginAccount;

    private String loginApp;

    private String loginMode;

    private String isLogined;

    private String lastLoginTime;

    private String lastLoginIp;

    private String loginTime;

    private String loginIp;

    public UserLoginLogPO(Long id, Long userId, String loginAccount, String loginApp, String loginMode, String isLogined, String lastLoginTime, String lastLoginIp, String loginTime, String loginIp) {
        this.id = id;
        this.userId = userId;
        this.loginAccount = loginAccount;
        this.loginApp = loginApp;
        this.loginMode = loginMode;
        this.isLogined = isLogined;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
        this.loginTime = loginTime;
        this.loginIp = loginIp;
    }

    public UserLoginLogPO() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    public String getLoginApp() {
        return loginApp;
    }

    public void setLoginApp(String loginApp) {
        this.loginApp = loginApp == null ? null : loginApp.trim();
    }

    public String getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(String loginMode) {
        this.loginMode = loginMode == null ? null : loginMode.trim();
    }

    public String getIsLogined() {
        return isLogined;
    }

    public void setIsLogined(String isLogined) {
        this.isLogined = isLogined == null ? null : isLogined.trim();
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime == null ? null : lastLoginTime.trim();
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime == null ? null : loginTime.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }
}