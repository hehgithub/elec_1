package com.ww.project.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.ww.project.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IdenHistoryController {
    @Autowired
    DeviceMapper deviceMapper;

    @GetMapping("/history")
    public String list(Model model){
        return "iden_history";
    }
}
