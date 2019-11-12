package com.wlwaq.elec_2.bean;

import lombok.Data;

@Data
public class RegRecord {
    private String biaoshi;
    private String secret_step3;
    private String Db_sign_step3;
    private String Db_enc_step3;
    private String ka_step1;
    private String kb_step2;
    private String send_costomer_enc_step3;
    private String receive_costomer_enc_step4;
    private String receive_costomer_dec_step4;
    private String device_type;
    private String device_brand;
    private String device_version;
    private String mac;
    private String ip;
}
