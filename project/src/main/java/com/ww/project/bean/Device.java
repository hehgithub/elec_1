package com.ww.project.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Device {
    private String id;
    private String device_type;
    private String device_brand;
    private String device_version;
    private String mac;
    private String ip;
    private String iden_id;
    private Date register_time;
    private Date online_time;
    private String status;
}
