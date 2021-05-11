package com.example.team2021.Controller;

import com.example.team2021.Entity.Ziliaohuizong;
import com.example.team2021.Service.ZiliaohuizongService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("ziliaozongjie")
public class ziliaozongjieController {
    @Autowired
    private ZiliaohuizongService ziliaohuizongService;

    @GetMapping("yuwen")
    public String getziliaozongjieyunwen(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                         @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize,
//                                         @RequestParam(value = "admin_name",defaultValue = "")String admin_name ,
//                                         @RequestParam(value ="admin_tel",defaultValue = "")String admin_tel ,
                                         Model model){
        PageInfo<Ziliaohuizong> ziliaohuizong = ziliaohuizongService.findAllziliao(pageIndex,pageSize);
        model.addAttribute("ziliaohuizongs",ziliaohuizong);
        return "course";
    }
    @GetMapping("yingyu")
    public String getziliaoyingyu(){
        return "course-2";
    }
    @GetMapping("shuxue")
    public String getziliaoshuxue(){
        return "course-3";
    }
    @GetMapping("wuli")
    public String getziliaowuli(){
        return "course-4";
    }
    @GetMapping("huaxue")
    public String getziliaohuaxue(){
        return "course-5";
    }
    @GetMapping("huizong")
    public String getziliaohuizong(){
        return "course-detail";
    }
}
