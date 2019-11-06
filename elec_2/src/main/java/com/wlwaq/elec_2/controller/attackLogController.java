package com.wlwaq.elec_2.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wlwaq.elec_2.bean.log;
import com.wlwaq.elec_2.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class attackLogController {
    @Autowired
    LogMapper logMapper;

    @GetMapping("/log")
    public String log(Model model,
                      @RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex){
        PageHelper.startPage(pageIndex,10);
        List<log> logList = logMapper.list();
        PageInfo<log> pageInfo = new PageInfo<>(logList);
        model.addAttribute("page",pageInfo);
        return "attackLog";
    }
}
