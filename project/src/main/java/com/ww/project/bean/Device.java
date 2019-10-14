package com.ww.project.bean;

public class Device {
    private Integer id;
    private String device_type;
    private String device_brand;
    private String device_version;
    private String mac;
    private String ip;
    private String iden_id;
    private String status;

    public Integer getId() {
        return id;
    }

    public String getDevice_type() {
        return device_type;
    }

    public String getDevice_brand() {
        return device_brand;
    }

    public String getDevice_version() {
        return device_version;
    }

    public String getMac() {
        return mac;
    }

    public String getIp() {
        return ip;
    }

    public String getIden_id() {
        return iden_id;
    }

    public String isStatus() {
        return status;
    }
}
