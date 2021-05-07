package com.example.team2021.Controller;

import com.example.team2021.Entity.issue;
import com.example.team2021.Service.issueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @className: com.example.team2021.Controller-> issueController
 * @description: 试题
 * @author: 曾豪
 * @createDate: 2021-05-07 8:39
 * @version: 1.0
 * @todo:
 */

@Controller
@RequestMapping("/issue")
public class issueController {
    @Autowired
    private issueService issueService;

    @GetMapping("/main")
    public String getIssueMath(Model model){
        List<issue> allIssue = issueService.findAllIssue();
        model.addAttribute("issue",allIssue);
        System.out.println(model.getAttribute("issue"));
        return "掌上刷题.html";
    }
}
