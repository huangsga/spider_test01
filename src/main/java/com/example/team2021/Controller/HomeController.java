package com.example.team2021.Controller;

import com.example.team2021.Entity.kemu;
import com.example.team2021.Service.issueService;
import com.example.team2021.ServiceImpl.UserServiceImpl;
import com.example.team2021.ServiceImpl.issueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main")
public class HomeController {
    @Autowired
    private issueServiceImpl issuService;

    @GetMapping("/issue")
    public String getIssue(Model model){
//        掌上刷题链接科目
//        List<kemu> kemus = issueService.findAllKemu();
//        model.addAttribute("kemu",kemus);
        return "index-1";
    }


}
