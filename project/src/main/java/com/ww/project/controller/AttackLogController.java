package com.ww.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttackLogController {
    @GetMapping("/log")
    public String list(){
        return "attack_log";
    }
}
