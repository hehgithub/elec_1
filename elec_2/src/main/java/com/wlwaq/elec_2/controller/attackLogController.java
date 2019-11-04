package com.wlwaq.elec_2.controller;

import com.wlwaq.elec_2.bean.log;
import com.wlwaq.elec_2.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class attackLogController {
    @Autowired
    LogMapper logMapper;

    @GetMapping("/log")
    public String log(Model model){
        List<log> logList = logMapper.list();
        model.addAttribute("logs",logList);
        return "attackLog";
    }
}
