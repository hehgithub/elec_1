package com.ww.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProcessController {

    @GetMapping("/process")
    public String list(){
        return "process";
    }

    @PostMapping("/process_register")
    public String process_register()
    {
        return "process_register";
    }

    @PostMapping("/process_trans")
    public String process_trans(){
        return "process_trans";
    }
}
