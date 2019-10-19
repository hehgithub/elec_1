package com.ww.project.controller;

import com.ww.project.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DelDevController {
    @Autowired
    DeviceMapper deviceMapper;

    @DeleteMapping("/del/{id}")
    public String  DelDev(@PathVariable("id") Integer id){
        deviceMapper.DelDev(id);
        return "redirect:/manage";
    }

    @DeleteMapping("/dell/{id}")
    public String  DellDev(@PathVariable("id") Integer id){
        deviceMapper.DelDev(id);
        return "redirect:/info";
    }
}
