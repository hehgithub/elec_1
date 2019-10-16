package com.ww.project.controller;

import com.ww.project.bean.Device;
import com.ww.project.bean.log;
import com.ww.project.mapper.DeviceMapper;
import com.ww.project.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class acontroller {
    @Autowired
    LogMapper logMapper;

    @GetMapping("/log/{id}")
    public log getLog(@PathVariable("id") Integer id) {

        return logMapper.getLogById(id);
    }

    @Autowired
    DeviceMapper deviceMapper;

    @GetMapping("/dev/{id}")
    public Device getDev(@PathVariable("id") Integer id){
        return deviceMapper.getDevById(id);
    }

    @GetMapping("/c")
    public Integer allCount(){
        return logMapper.allCount();
    }

    @GetMapping("/d")
    public Integer dosCount(){
        return logMapper.dosCount();
    }

    @GetMapping("/e")
    public Integer devCount(){
        return deviceMapper.devCount();
    }
}
