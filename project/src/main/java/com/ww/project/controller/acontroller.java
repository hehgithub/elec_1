package com.ww.project.controller;

import com.alibaba.fastjson.JSON;
import com.ww.project.bean.Device;
import com.ww.project.bean.log;
import com.ww.project.bean.test;
import com.ww.project.mapper.DeviceMapper;
import com.ww.project.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/test")
    @ResponseBody
    public String  findById() {
        String list = JSON.toJSONString(new test("帽子",50));
        return list;
    }
}
