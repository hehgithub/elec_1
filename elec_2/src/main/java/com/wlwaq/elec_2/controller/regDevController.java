package com.wlwaq.elec_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class regDevController {
    @GetMapping("/regDev")
    public String regDev(){
        return "regDev";
    }
}
