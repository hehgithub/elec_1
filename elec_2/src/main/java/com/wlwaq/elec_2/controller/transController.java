package com.wlwaq.elec_2.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wlwaq.elec_2.bean.Socket;
import com.wlwaq.elec_2.mapper.RegDevMapper;
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

    @Autowired
    RegDevMapper regDevMapper;

    @GetMapping("/trans")
    public String trans(Model model,
                        @RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex){
        PageHelper.startPage(pageIndex,10);
        List<Socket> socketList = transMapper.list();
        for (int i=0;i<socketList.size();i++){
            socketList.get(i).setIp(regDevMapper.getIp(socketList.get(i).getID_costomer()));
        }
        PageInfo<Socket> pageInfo = new PageInfo<>(socketList);
        model.addAttribute("page",pageInfo);
        return "trans";
    }

    @GetMapping("/transReview")
    public String transReview(){
        return "regProcess";
    }
}
