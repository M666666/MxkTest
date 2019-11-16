package com.lordor.springboot1.entity;

import java.sql.Timestamp;

public class Login {

    private Integer loginId;
    private String username;
    private String password;
    private String logindept;
    private Timestamp createTime;



    public Integer getLoginId() {
        return loginId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLogindept() {
        return logindept;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogindept(String logindept) {
        this.logindept = logindept;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Login{" +
                "loginId=" + loginId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", logindept='" + logindept + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
