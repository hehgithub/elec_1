package com.wlwaq.elec_2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.wlwaq.elec_2.bean.Count;
import com.wlwaq.elec_2.bean.TempHumi;
import com.wlwaq.elec_2.bean.TempandHumi;
import com.wlwaq.elec_2.mapper.LogMapper;
import com.wlwaq.elec_2.mapper.RegDevMapper;
import com.wlwaq.elec_2.mapper.TransMapper;
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

    @Autowired
    TransMapper transMapper;

    @GetMapping("/main")
    public String dashboard(Model model){
        model.addAttribute("logcount",logMapper.allCount());
        model.addAttribute("devcount",regDevMapper.devCount());
        model.addAttribute("regdevcount",regDevMapper.regDevCount());
        return "dashboard";
    }

    @RequestMapping("/chart1")
    @ResponseBody
    public String devCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("温湿度传感器",regDevMapper.wsdCount()));
        countList.add(new Count("电流传感器",regDevMapper.dianliuCount()));
        countList.add(new Count("电压传感器",regDevMapper.dyCount()));
        countList.add(new Count("烟雾传感器",regDevMapper.ywCount()));

        String json = JSON.toJSONString(countList);
        return json;
    }

    @RequestMapping("/chart2")
    @ResponseBody
    public String devvCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("注册设备",regDevMapper.regDevCount()));
        countList.add(new Count("注销设备",regDevMapper.disregDevCount()));
        countList.add(new Count("未注册设备",regDevMapper.unregDevCount()));

        String json = JSON.toJSONString(countList);
        return json;
    }

    @RequestMapping("/chart3")
    @ResponseBody
    public String logCount(){
        List<Count> countList = new ArrayList<>();
        countList.add(new Count("假冒攻击",logMapper.jmCount()));
        countList.add(new Count("重放攻击",logMapper.cfConut()));
        countList.add(new Count("反射攻击",logMapper.zjrConut()));
        String json = JSON.toJSONString(countList);
        return json;
    }

    @RequestMapping("/chart4")
    @ResponseBody
    public String temp_humi(){
        List<TempHumi> tempHumiList = transMapper.Tlist();
        List<TempandHumi> tempandHumiList = new ArrayList<>();
        for (int i=0;i<tempHumiList.size();i++){
           String ming = tempHumiList.get(i).getMing();
           if (ming.substring(0,4).equals("temp")){
               String temp = ming.substring(5,11);
               String humi = ming.substring(16,22);
               tempandHumiList.add(new TempandHumi(temp,humi,tempHumiList.get(i).getTime()));
           }else {
               String humi = ming.substring(5,11);
               String temp = ming.substring(16,22);
               tempandHumiList.add(new TempandHumi(temp,humi,tempHumiList.get(i).getTime()));
           }
        }
        JSON.DEFFAULT_DATE_FORMAT = "HH:mm:ss";
        String json = JSON.toJSONString(tempandHumiList,SerializerFeature.WriteDateUseDateFormat);

        return json;
    }
}
