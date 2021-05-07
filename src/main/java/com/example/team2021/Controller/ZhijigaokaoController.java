package com.example.team2021.Controller;

import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Service.ZhijigaokaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/zjgk")
public class ZhijigaokaoController {
    @Autowired
    private ZhijigaokaoService zhijigaokaoService;

    @GetMapping("/ch")
    public String getCh(Model model){
        List<Zhijigaokao> zhijigaokao =zhijigaokaoService.findAllch1();
        model.addAttribute("zhijigaokao",zhijigaokao);
        return "zhijigaokao";
    }

}
