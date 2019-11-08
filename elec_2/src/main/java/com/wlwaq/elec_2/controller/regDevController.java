package com.wlwaq.elec_2.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wlwaq.elec_2.bean.regDev;
import com.wlwaq.elec_2.mapper.RegDevMapper;
import com.wlwaq.elec_2.mapper.RegistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class regDevController {
    @Autowired
    RegDevMapper regDevMapper;

    @Autowired
    RegistMapper registMapper;

    @GetMapping("/regDev")
    public String regDev(Model model,
                         @RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex){
        PageHelper.startPage(pageIndex,10);
        List<regDev> regDevList = regDevMapper.list();
        for (int i=0;i<regDevList.size();i++){
            if (regDevList.get(i).getPermit()!="not"){
                regDevList.get(i).setTime(registMapper.getRegTime(regDevList.get(i).getIden_id()));
            }
        }
        PageInfo<regDev> pageInfo = new PageInfo<>(regDevList);
        model.addAttribute("page",pageInfo);
        return "regDev";
    }

    @GetMapping("/register/{mac}")
    public String pass(@PathVariable("mac") String mac){
        regDevMapper.pass(mac);
        return "redirect:/regDev";
    }

    @GetMapping("/logout/{mac}")
    public String logout(@PathVariable("mac") String mac){
        regDevMapper.logout(mac);
        return "redirect:/regDev";
    }
}
