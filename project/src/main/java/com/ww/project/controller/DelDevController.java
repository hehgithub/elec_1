package com.ww.project.controller;

import com.ww.project.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DelDevController {
    @Autowired
    DeviceMapper deviceMapper;

    @GetMapping("/delete")
    public void DelDev(@PathVariable("id") Integer id){
        deviceMapper.DelDev(id);
    }
}
