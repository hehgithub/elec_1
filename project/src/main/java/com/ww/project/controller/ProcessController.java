package com.ww.project.controller;

import com.ww.project.bean.Device;
import com.ww.project.bean.If;
import com.ww.project.bean.Regist;
import com.ww.project.bean.Socket;
import com.ww.project.mapper.DeviceMapper;
import com.ww.project.mapper.IfMapper;
import com.ww.project.mapper.RegistMapper;
import com.ww.project.mapper.SocketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProcessController {

    @Autowired
    IfMapper ifMapper;

    @Autowired
    RegistMapper registMapper;

    @Autowired
    SocketMapper socketMapper;

    @GetMapping("/process")
    public String list(Model model){
        If iff = ifMapper.getNewIf();
        model.addAttribute("iff", iff);
        return "process";
    }

    @PostMapping("/process_register")
    public String process_register(Model model)
    {
        Regist regist = registMapper.getNewRegist();
        model.addAttribute("regist",regist);
        return "process_register";
    }

    @PostMapping("/process_trans")
    public String process_trans(Model model){
        Socket socket = socketMapper.getNewSocket();
        model.addAttribute("socket",socket);
        return "process_trans";
    }
}
