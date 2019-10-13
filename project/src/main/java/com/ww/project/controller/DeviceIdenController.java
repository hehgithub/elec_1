package com.ww.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceIdenController {
    @GetMapping("/iden")
    public String list(){
        return "device_iden";
    }
}