package com.lordor.springboot1.entity;

public class LogoEntity {

    private Integer logoid;
    private String username;
    private String ip;
    private String createTime;

    public void setLogoid(Integer logoid) {
        this.logoid = logoid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getLogoid() {
        return logoid;
    }

    public String getUsername() {
        return username;
    }

    public String getIp() {
        return ip;
    }

    public String getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "LogoEntity{" +
                "logoid=" + logoid +
                ", username='" + username + '\'' +
                ", ip='" + ip + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
