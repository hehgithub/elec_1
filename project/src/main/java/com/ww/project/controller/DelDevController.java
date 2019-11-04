package com.ww.project.controller;

import com.ww.project.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DelDevController {
    @Autowired
    DeviceMapper deviceMapper;

    @GetMapping("/delreg/{mac}")
    public String  DelDev(@PathVariable("mac") String mac){
        deviceMapper.DelRegDev(mac);
        return "redirect:/iden";
    }

    @DeleteMapping("/dell/{mac}")
    public String  DellDev(@PathVariable("mac") String mac){
        deviceMapper.DelDev(mac);
        return "redirect:/info";
    }

    @GetMapping("/delon/{mac}")
    public String DelOnDev(@PathVariable("mac") String mac){
        deviceMapper.DelOnDev(mac);
        return "redirect:/manage";
    }
}
