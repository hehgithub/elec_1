package com.ww.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sun.misc.Contended;

@Controller
public class NewDevController {

    @GetMapping("/newDev")
    public String newDev(){
        return "new_dev";
    }
}
