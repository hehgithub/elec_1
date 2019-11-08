package com.wlwaq.elec_2.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wlwaq.elec_2.bean.IdenDev;
import com.wlwaq.elec_2.bean.Identity;
import com.wlwaq.elec_2.mapper.IdenDevMapper;
import com.wlwaq.elec_2.mapper.IdentityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class idenRecordController {
    @Autowired
    IdentityMapper identityMapper;

    @Autowired
    IdenDevMapper idenDevMapper;

    @GetMapping("/idenRecord")
    public String idenRecord(Model model,
                             @RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex){
        PageHelper.startPage(pageIndex,10);
        List<IdenDev> list = idenDevMapper.list();
        PageInfo<IdenDev> pageInfo = new PageInfo<>(list);
        model.addAttribute("page", pageInfo);
        return "idenRecord";
    }

    @GetMapping("/idenReview")
    public String idenReview(Model model,
                             @RequestParam("ip")String ip,
                             @RequestParam("time")String time){
        Identity identity = identityMapper.getRecord(ip,time);
        model.addAttribute("record", identity);
        return "idenProcess";
    }
}
