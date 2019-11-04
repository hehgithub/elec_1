package com.ww.project.controller;

import com.ww.project.bean.Device;
import com.ww.project.mapper.DeviceMapper;
import com.ww.project.mapper.RegistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class RegisterDeviceController {

    @Autowired
    DeviceMapper deviceMapper;

    @Autowired
    RegistMapper registMapper;

    @GetMapping("/regDev")
    public String list(Model model){
//        List<Device> deviceList = deviceMapper.register_dev();
//        for(int i=0;i<deviceList.size();i++){
//            Date time = registMapper.getTime(deviceList.get(i).getIden_id());
//            deviceList.get(i).setRegister_time(time);
//        }
//        model.addAttribute("devices",deviceList);
        return "register_dev";
    }
}