package com.ww.project.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Regist {
    public Integer id;
    public String device_inf;
    public String MAC_IP;
    public String Y_or_N;
    public String biaoshi;
    public String secret;
    public String name_key;
    public String dense;
}
