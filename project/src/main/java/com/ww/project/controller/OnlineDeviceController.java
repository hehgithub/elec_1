package com.ww.project.controller;

import com.ww.project.bean.Device;
import com.ww.project.mapper.DeviceMapper;
import com.ww.project.mapper.OnlineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OnlineDeviceController {
    @Autowired
    DeviceMapper deviceMapper;

    @Autowired
    OnlineMapper onlineMapper;

    @GetMapping("/manage")
    public String list(Model model){
        List<Device> deviceList = deviceMapper.online_dev();
        for(int i=0;i<deviceList.size();i++){
            deviceList.get(i).setOnline_time(onlineMapper.getOnline(deviceList.get(i).getIden_id()));
        }
        model.addAttribute("devices", deviceList);
        return "online_dev";
    }
}
