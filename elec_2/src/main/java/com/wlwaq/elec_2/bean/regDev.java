package com.wlwaq.elec_2.bean;

import lombok.Data;

import java.util.Date;

@Data
public class regDev {
    private String device_type;
    private String device_brand;
    private String device_version;
    private String mac;
    private String ip;
    private String status;
    private String iden_id;
    private Date time;
    private String permit;
}
