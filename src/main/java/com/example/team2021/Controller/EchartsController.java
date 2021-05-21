package com.example.team2021.Controller;

import com.example.team2021.Entity.Echarts;
import com.example.team2021.Service.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/chart")
public class EchartsController {

    @Autowired
    private EchartsService echartsService;

    @GetMapping("/show")
    private String showData1(Model model) {
        List<Echarts> list11 = echartsService.findMath1();
        List<Echarts> list22 = echartsService.findMath2();
//        List<Echarts> listALL = echartsService.findALL();
        model.addAttribute("list11", list11);
        model.addAttribute("list22", list22);
//        model.addAttribute("listAll",listALL);

        return "Echarts";

    }
    @GetMapping("/showPie")
    private String showData2() {
        return "Echart-pie";
    }
    @GetMapping("/showBar")
    private String showData3() {
        return "Echart-bar";
    }
    @GetMapping("/showHX1")
    private String showHx1(){return "EchartsHX1";}
    @GetMapping("/showWuli1")
    private String showWuli1() {
        return "WLBX";
    }
    @GetMapping("/showWuli2")
    private String showWuli2() {
        return "WLXX";
    }
    @GetMapping("/showWuli3")
    private String showWuli3() {
        return "WLXX-1";
    }
    @GetMapping("/showWuli4")
    private String showWuli4() {
        return "WLXX-2";
    }
    @GetMapping("/showWuli5")
    private String showWuli5() {
        return "WLXX-3";
    }
    @GetMapping("/showWuli6")
    private String showWuli6() {
        return "WLXX-4";
    }

    @GetMapping("/show1")
    private String show1() {
        return "可视化1";
    }
}
