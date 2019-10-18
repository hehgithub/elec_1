package com.ww.project.controller;

import com.ww.project.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AddController {
    @Autowired
    DeviceMapper deviceMapper;

    @GetMapping("/add")
    public String add(){
        return "add";
    }

    @PostMapping("/adddev")
    public String adddev(@RequestParam("type") String type,
                         @RequestParam("brand") String brand,
                         @RequestParam("version") String version,
                         @RequestParam("mac") String mac,
                         @RequestParam("ip") String ip){
        deviceMapper.addDev(type, brand, version, mac, ip);
        return "add_success";
    }
}
