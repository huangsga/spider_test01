package com.example.team2021.Controller;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Service.issueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/main")
public class HomeController {
    @Autowired
    private issueService issueService;

    @GetMapping("/index")
    public String getIssue(Model model){
        /**
         * 获取刷题的科目名称
         */
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        return "index-1";
    }


}
