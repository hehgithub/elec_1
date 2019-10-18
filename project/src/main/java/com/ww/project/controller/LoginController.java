package com.ww.project.controller;

import com.ww.project.mapper.DeviceMapper;
import com.ww.project.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    DeviceMapper deviceMapper;

    @Autowired
    LogMapper logMapper;

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session,
                        Model model){
        if(!StringUtils.isEmpty(username)&&!StringUtils.isEmpty(password)){
            session.setAttribute("loginUser",username);
            model.addAttribute("devcount", deviceMapper.devCount());
            model.addAttribute("devvcount",deviceMapper.devvCount());
            model.addAttribute("logcount",logMapper.allCount());
            return "dashboard";
        }else {
            map.put("msg","用户名密码错误");
            return "login";
        }
    }
}
