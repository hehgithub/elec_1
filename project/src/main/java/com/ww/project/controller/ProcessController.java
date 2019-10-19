package com.ww.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProcessController {

    @GetMapping("/process")
    public String list(){
        return "process1";
    }

    @PostMapping("/process_register")
    public String process_1()
    {
        return "process_1";
    }
}
