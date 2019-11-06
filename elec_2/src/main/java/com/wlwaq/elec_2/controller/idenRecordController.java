package com.wlwaq.elec_2.controller;

import com.wlwaq.elec_2.bean.IdenDev;
import com.wlwaq.elec_2.bean.Identity;
import com.wlwaq.elec_2.mapper.IdenDevMapper;
import com.wlwaq.elec_2.mapper.IdentityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class idenRecordController {
    @Autowired
    IdentityMapper identityMapper;

    @Autowired
    IdenDevMapper idenDevMapper;

    @GetMapping("/idenRecord")
    public String idenRecord(Model model){
        List<IdenDev> list = idenDevMapper.list();
        model.addAttribute("devices", list);
        return "idenRecord";
    }

    @GetMapping("/idenReview")
    public String idenReview(Model model){
        Identity identity = identityMapper.getRecord();
        model.addAttribute("record", identity);
        return "idenProcess";
    }
}
