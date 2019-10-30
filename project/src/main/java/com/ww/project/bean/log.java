package com.ww.project.bean;

import lombok.Data;

import java.util.Date;

@Data
public class log {
    private Integer id;
    private String type;
    private Date date;
    private String dev_type;
    private String mac;
    private String ip;
    private String method;
}
