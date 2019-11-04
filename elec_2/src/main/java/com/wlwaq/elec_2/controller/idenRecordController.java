package com.wlwaq.elec_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class idenRecordController {
    @GetMapping("/idenRecord")
    public String idenRecord(){
        return "idenRecord";
    }
}
