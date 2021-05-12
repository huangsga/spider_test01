package com.example.team2021.Controller;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.jiaoCai;
import com.example.team2021.Service.issueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    private String jiaocaiId;
    @Autowired
    private issueService issueService;

    //语文试题
    @GetMapping("/main")
    public String getIssue(Model model) {
//        获取所有的题目
        List<ViewIssue> allIssue = issueService.findAllIssue();
        model.addAttribute("issue", allIssue);
//        获取科目名字
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        return "刷题.html";
    }

    @GetMapping("/main/{kemuId}")
    public String getIssueList(@PathVariable("kemuId") String kemuId, Model model) {
//        带科目参数获取题目
        List<ViewIssue> issueList = issueService.findIssueList(kemuId);
        model.addAttribute("issue", issueList);
//      获取到科目名称
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("labelName", kemuName);
        //获取必修教材
        List<ViewIssue> BXJiaocai = issueService.findJC("必修", kemuId);
        model.addAttribute("BXJiaocai", BXJiaocai);
//获取选修教材
        List<ViewIssue> XXJiaocai = issueService.findJC("选修", kemuId);
        model.addAttribute("XXJiaocai", XXJiaocai);

        return "刷题.html";
    }
    @GetMapping("/main/{kemuId}/{jiaocaiId}")
    public String getIssueLists(@PathVariable("kemuId") String kemuId,@PathVariable("jiaocaiId")String jiaocaiId, Model model) {
        List<ViewIssue> zhangjieName = issueService.findZhangjieName(kemuId, jiaocaiId);
        model.addAttribute("zhangjieName",zhangjieName);
        System.out.println(zhangjieName);
        return "redirect:/刷题.html";
    }

//    @GetMapping("/ZJ/{jcid}")
//    public void loadZhangJieName(@PathVariable("jcid")String jcid){
//        System.out.println(jcid);
//        jiaocaiId = jcid;
//    }

    @GetMapping("/details/{shitiId}")
    public String getIssueDetails(@PathVariable("shitiId") Integer shitiId,Model model){
        List<ViewIssue> issueDetails = issueService.findIssueDetails(shitiId);
        model.addAttribute("issueDetails",issueDetails);
        return "刷题详情.html";
    }
}
