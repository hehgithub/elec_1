package com.ww.project.controller;

import com.alibaba.fastjson.JSON;
import com.ww.project.bean.Count;
import com.ww.project.mapper.DeviceMapper;
import com.ww.project.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DashboardController {
    @Autowired
    DeviceMapper deviceMapper;

    @Autowired
    LogMapper logMapper;

    @GetMapping("/main")
    public String list(Model model){
        model.addAttribute("devcount", deviceMapper.devCount());
        model.addAttribute("devvcount",deviceMapper.devvCount());
        model.addAttribute("logcount",logMapper.allCount());
        return "dashboard";
    }

    @RequestMapping("/chart1")
    @ResponseBody
    public String devCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("温度传感器",deviceMapper.wdCount()));
        countList.add(new Count("电流传感器",deviceMapper.dlCount()));
        countList.add(new Count("Router",deviceMapper.routerCount()));
        countList.add(new Count("IP Camera",deviceMapper.ipCount()));

        String json = JSON.toJSONString(countList);
        return json;
    }

    @RequestMapping("/chart2")
    @ResponseBody
    public String devvCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("温度传感器",deviceMapper.wd1Count()));
        countList.add(new Count("电流传感器",deviceMapper.dl1Count()));
        countList.add(new Count("Router",deviceMapper.router1Count()));
        countList.add(new Count("IP Camera",deviceMapper.ip1Count()));

        String json = JSON.toJSONString(countList);
        return json;
    }

    @RequestMapping("/chart3")
    @ResponseBody
    public String logCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("Dos攻击",logMapper.dosCount()));
        countList.add(new Count("重放攻击",logMapper.cfConut()));
        String json = JSON.toJSONString(countList);
        return json;
    }
}
