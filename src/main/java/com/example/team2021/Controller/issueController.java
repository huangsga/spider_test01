package com.example.team2021.Controller;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.issue;
import com.example.team2021.Entity.jiaoCai;
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
    public String getIssue(Model model){
//        试题内容展示
        List<ViewIssue> allIssue = issueService.findAllIssueItem();
        model.addAttribute("issue",allIssue);
//        必修教材内容展示
        List<jiaoCai> jiaoCaiBX = issueService.findjiaoCaiBX();
        model.addAttribute("jiaoCaiBX",jiaoCaiBX);
//        选修教材内容展示
        List<jiaoCai> jiaoCaiXX = issueService.findjiaoCaiXX();
        model.addAttribute("jiaoCaiXX",jiaoCaiXX);
//        章节内容展示
        List<ViewIssue> zhangjieItem = issueService.findzhangJie();
        model.addAttribute("zhangjieItem",zhangjieItem);

        return "掌上刷题.html";
    }

    @GetMapping("/details")
    public String getIssueItem(){
        return "掌上刷题-详情页.html";
    }
}
