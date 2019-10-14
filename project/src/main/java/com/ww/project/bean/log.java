package com.ww.project.bean;

import java.util.Date;

public class log {
    private Integer id;
    private String type;
    private Date date;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public String getMethod() {
        return method;
    }

    private String method;
}
