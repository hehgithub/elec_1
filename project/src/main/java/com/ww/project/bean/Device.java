package com.ww.project.bean;

import lombok.Data;

@Data
public class Device {
    private Integer id;
    private String device_type;
    private String device_brand;
    private String device_version;
    private String mac;
    private String ip;
    private String iden_id;
    private String status;
}
