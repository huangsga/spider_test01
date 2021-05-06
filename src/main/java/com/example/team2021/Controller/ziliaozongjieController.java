package com.example.team2021.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ziliaozongjie")
public class ziliaozongjieController {

    @GetMapping("yuwen")
    public String getziliaozongjieyunwen(){
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
