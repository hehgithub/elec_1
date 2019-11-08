package com.wlwaq.elec_2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TempandHumi {
    private String temp;
    private String humi;
    private Date time;
}
