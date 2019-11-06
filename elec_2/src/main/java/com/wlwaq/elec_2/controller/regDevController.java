package com.wlwaq.elec_2.controller;

import com.wlwaq.elec_2.bean.regDev;
import com.wlwaq.elec_2.mapper.RegDevMapper;
import com.wlwaq.elec_2.mapper.RegistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class regDevController {
    @Autowired
    RegDevMapper regDevMapper;

    @Autowired
    RegistMapper registMapper;

    @GetMapping("/regDev")
    public String regDev(Model model){
        List<regDev> regDevList = regDevMapper.list();
        for (int i=0;i<regDevList.size();i++){
            if (regDevList.get(i).getPermit()!="not"){
                regDevList.get(i).setTime(registMapper.getRegTime(regDevList.get(i).getIden_id()));
            }
        }
        model.addAttribute("devices",regDevList);
        return "regDev";
    }

    @GetMapping("/register")
    public String pass(){
        return "regDev";
    }
}
