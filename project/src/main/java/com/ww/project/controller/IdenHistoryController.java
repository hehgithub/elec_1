package com.ww.project.controller;

import com.ww.project.mapper.IdenlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IdenHistoryController {
    @Autowired
    IdenlogMapper idenlogMapper;

    @GetMapping("/idenRecord")
    public String list(Model model){
//        List<Idenlog> idenlogList = idenlogMapper.list();
//        model.addAttribute("idenlogs",idenlogList);
        return "iden_record";
    }
}
