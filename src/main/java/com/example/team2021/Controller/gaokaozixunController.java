package com.example.team2021.Controller;

import com.example.team2021.Entity.gaokaozixun;
import com.example.team2021.Service.gaokaozixunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("gaokaozixun")
public class gaokaozixunController {
    @Autowired
    private gaokaozixunService gaokaozixunService;

    @RequestMapping("/zixunlist")
    public String getZixuntitle(Model model){
        List<gaokaozixun> gaokaozixun=gaokaozixunService.findAllpolicy();
        model.addAttribute("Gk",gaokaozixun);
        return "zixunlist";
    }
}
