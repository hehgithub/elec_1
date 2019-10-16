package com.ww.project.controller;

import com.ww.project.bean.log;
import com.ww.project.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AttackLogController {
    @Autowired
    private LogMapper logMapper;

    @GetMapping("/log")
    public String list(Model model){

        List<log> logList = logMapper.list();
        model.addAttribute("logs",logList);
        return "attack_log";
    }
}
