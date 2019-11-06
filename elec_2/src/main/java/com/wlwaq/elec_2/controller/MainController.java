package com.wlwaq.elec_2.controller;

import com.alibaba.fastjson.JSON;
import com.wlwaq.elec_2.bean.Count;
import com.wlwaq.elec_2.mapper.LogMapper;
import com.wlwaq.elec_2.mapper.RegDevMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    LogMapper logMapper;
    
    @Autowired
    RegDevMapper regDevMapper;

    @GetMapping("/")
    public String dashboard(Model model){
        model.addAttribute("logcount",logMapper.allCount());
        return "dashboard";
    }

    @RequestMapping("/chart1")
    @ResponseBody
    public String devCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("温度传感器",regDevMapper.wdCount()));
        countList.add(new Count("电流传感器",regDevMapper.dlCount()));
        countList.add(new Count("IP Camera",regDevMapper.ipCount()));

        String json = JSON.toJSONString(countList);
        return json;
    }

    @RequestMapping("/chart2")
    @ResponseBody
    public String devvCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("温度传感器",regDevMapper.wd1Count()));
        countList.add(new Count("电流传感器",regDevMapper.dl1Count()));
        countList.add(new Count("IP Camera",regDevMapper.ip1Count()));

        String json = JSON.toJSONString(countList);
        return json;
    }

    @RequestMapping("/chart3")
    @ResponseBody
    public String logCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("假冒攻击",logMapper.jmCount()));
        countList.add(new Count("重放攻击",logMapper.cfConut()));
        countList.add(new Count("中间人攻击",logMapper.zjrConut()));
        String json = JSON.toJSONString(countList);
        return json;
    }
}
