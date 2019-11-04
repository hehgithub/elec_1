package com.ww.project.controller;

import com.ww.project.bean.Device;
import com.ww.project.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LegalDeviceController {
    @Autowired
    DeviceMapper deviceMapper;

    @GetMapping("/info")
    public String list(Model model){
        List<Device> deviceList = deviceMapper.list();
        model.addAttribute("devices", deviceList);
        return "legal_dev";
    }
}
