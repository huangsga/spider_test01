package com.example.team2021.Controller;

import com.example.team2021.Entity.gaokaozixun;
import com.example.team2021.Service.gaokaozixunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("gaokaozixun")
public class gaokaozixunController {
    @Autowired
    private gaokaozixunService gaokaozixunService;

    @RequestMapping("/zixunall")
    public String getZixunall(Model model){
        List<gaokaozixun> gaokaozixun1=gaokaozixunService.findAlltype();
        List<gaokaozixun> gaokaozixun2=gaokaozixunService.findAlldes();
        model.addAttribute("Type",gaokaozixun1);
        model.addAttribute("Des",gaokaozixun2);
        return "blog";
    }

    @RequestMapping("/zixunlist/{zixun_type}")
    public String getZixunValue(@PathVariable("zixun_type")String zixun_type, Model model){
        List<gaokaozixun> gaokaozixun=gaokaozixunService.findAlltitle(zixun_type);
        model.addAttribute("Gk",gaokaozixun);
        return "blog-list";
    }

    @GetMapping("zixundetail")
    public String details(@RequestParam("zixun_id") Integer zixun_id,Model model){
        List<gaokaozixun> gaokaozixun=gaokaozixunService.findAllbyid(zixun_id);
        model.addAttribute("Di",gaokaozixun);
        return "blog-detail";
    }

    @GetMapping("/zixundetail/{zixun_id}")
    public String getZixundetail(@PathVariable("zixun_id")Integer zixun_id,Model model){
//        List<gaokaozixun> gaokaozixun=gaokaozixunService.findAllbyid(zixun_id);
//        model.addAttribute("Di",gaokaozixun);
        return "blog-detail";
    }

}
