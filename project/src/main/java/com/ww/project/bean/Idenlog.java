package com.ww.project.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Idenlog {
    private String sid;
    private String ip;
    private String dev_type;
    private Date time;
    private String operate;
}
