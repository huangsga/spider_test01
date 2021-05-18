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
@RequestMapping("chart")
public class EchartsController {

    @Autowired
    private EchartsService echartsService;

    @GetMapping("/show11")
    private String showData1(Model model) {
        List<Echarts> list11 = echartsService.findMath1();
        List<Echarts> list22 = echartsService.findMath2();
        model.addAttribute("list22", list22);
        model.addAttribute("list11", list11);
        return "Echarts";

    }
//    @GetMapping("/show12")
//    private String showData2(Model model) {
//        List<Echarts> list22 = echartsService.findMath2();
//        model.addAttribute("list22", list22);
//        return "Echarts";
//
//    }
}