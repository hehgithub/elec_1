package com.ww.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> map(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from sensor");
        return list.get(0);
    }
}
