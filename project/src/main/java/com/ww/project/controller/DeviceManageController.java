package com.ww.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceManageController {
    @GetMapping("/manage")
    public String list(){
        return "device_manage";
    }
}
