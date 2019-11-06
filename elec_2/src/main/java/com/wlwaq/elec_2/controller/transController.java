package com.wlwaq.elec_2.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.wlwaq.elec_2.bean.Socket;
import com.wlwaq.elec_2.mapper.TransMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class transController {
    @Autowired
    TransMapper transMapper;

    @GetMapping("/trans")
    public String trans(Model model,
                        @RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex){
        List<Socket> socketList = transMapper.list();
        model.addAttribute("sockets",socketList);
        return "trans";
    }

    @GetMapping("/transReview")
    public String transReview(){
        return "transProcess";
    }
}
