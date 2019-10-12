package com.ww.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;


@Controller
public class acontroller {
    @ResponseBody
    @RequestMapping("/h")
    public String a(){
        return "aa";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hellow","你好");
        return "success";
    }
}
