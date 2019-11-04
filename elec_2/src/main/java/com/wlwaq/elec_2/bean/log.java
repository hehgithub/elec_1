package com.wlwaq.elec_2.bean;

import lombok.Data;

import java.util.Date;

@Data
public class log {
    private Integer id;
    private String type;
    private Date date;
    private String device_type;
    private String attack_ip;
    private String method;
}
