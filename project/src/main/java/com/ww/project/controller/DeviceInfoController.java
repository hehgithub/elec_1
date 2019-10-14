package com.ww.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceInfoController {
    @GetMapping("/info")
    public String list(){
        return "device_info";
    }
}
