package com.example.team2021.Controller;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.zhangJie;
import com.example.team2021.Service.issueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    @GetMapping("/main")
    public String getIssue(Model model) {
        /**
         * 查询所有题目
         * @param model
         * @return
         */

        List<ViewIssue> allIssue = issueService.findAllIssue();
        System.out.println(allIssue);
        int size = allIssue.size();
        model.addAttribute("issueSize",size);
        model.addAttribute("issue", allIssue);
        /**
         * 获取科目名字
         */
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        return "刷题.html";
    }

    @GetMapping("/main/{kemuId}")
    public String getIssueList(@PathVariable("kemuId") String kemuId, Model model,HttpServletRequest request) {
        /**
         *带科目参数获取题目
         */
        HttpSession session = request.getSession(true);
        session.setAttribute("kemuId",kemuId);//把用户数据保存到session对象中
        List<ViewIssue> issueList = issueService.findIssueList(kemuId);
        int size = issueList.size();
        model.addAttribute("issueSize",size);
        model.addAttribute("issue", issueList);
        /**
         * 获取到科目名称
         */
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        /**
         * 获取必修教材
         */
        List<ViewIssue> BXJiaocai = issueService.findJC("必修", kemuId);
        model.addAttribute("BXJiaocai", BXJiaocai);
        /**
         * 获取选修教材
         */
        List<ViewIssue> XXJiaocai = issueService.findJC("选修", kemuId);
        model.addAttribute("XXJiaocai", XXJiaocai);
        /**
         * 获取初始的所有章节
         */
        List<zhangJie> zhangjieNames =issueService.listZhangJie();
        model.addAttribute("zhangjieNames",zhangjieNames);
        return "刷题.html";
    }
    @GetMapping("/main/{kemuId}/{jiaocaiId}")
    public String getIssueLists(@PathVariable("kemuId") String kemuId,@PathVariable("jiaocaiId")String jiaocaiId, Model model) {
        List<ViewIssue> zhangjieName = issueService.findZhangjieName(kemuId, jiaocaiId);
        /**
         * 获取刷题的科目名称
         */
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        model.addAttribute("zhangjieName",zhangjieName);
        System.out.println(zhangjieName);
        return "redirect:/刷题.html";
    }

    /**
     * 查看试题详情
     * @param shitiId
     * @param model
     * @return
     */
    @GetMapping("/details/{shitiId}")
    public String getIssueDetails(@PathVariable("shitiId") Integer shitiId,Model model){
        List<ViewIssue> issueDetails = issueService.findIssueDetails(shitiId);
        model.addAttribute("issueDetails",issueDetails);
        //随机的三道举一反三的题目传进去
        /**
         * 获取三个ID kemuID,jiocaiId,zhangjieId
         * 从三个ID 查到的题目中随机获取三个数据
         */
        /**
         * 获取刷题的科目名称
         */
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        String kemuId = issueDetails.get(0).getKemuId();
        String jiaocaiId = issueDetails.get(0).getJiaocaiId();
        String zhangjieId = issueDetails.get(0).getZhangjieId();
        System.out.println(kemuId+"= "+jiaocaiId+" = "+zhangjieId);
        List<ViewIssue> issueRand = issueService.findIssueRand(kemuId, jiaocaiId, zhangjieId);
        model.addAttribute("issueRand",issueRand);
        System.out.println(issueRand);
        return "刷题详情.html";
    }

    /**
     * 二级查询
     * @param jiaocaiId
     * @param zhangjieId
     * @param model
     * @param request
     * @return
     */
    @GetMapping("/timu/{jiaocaiId}/{zhangjieId}")
    public String loadIssues(@PathVariable("jiaocaiId")String jiaocaiId, @PathVariable("zhangjieId")String zhangjieId, Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        String kemuId = (String) session.getAttribute("kemuId");
        System.out.println(kemuId);
        System.out.println(jiaocaiId);
        System.out.println(zhangjieId);
        List<ViewIssue> viewIssues = issueService.loadIssues(kemuId, jiaocaiId, zhangjieId);
        int size = viewIssues.size();
        model.addAttribute("issueSize",size);
        model.addAttribute("issue", viewIssues);
        /**
         * 获取到科目名称
         */
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        /**
         * 获取必修教材
         */
        List<ViewIssue> BXJiaocai = issueService.findJC("必修", kemuId);
        model.addAttribute("BXJiaocai", BXJiaocai);
        /**
         * 获取选修教材
         */
        List<ViewIssue> XXJiaocai = issueService.findJC("选修", kemuId);
        model.addAttribute("XXJiaocai", XXJiaocai);
        /**
         * 获取初始的所有章节
         */
        List<zhangJie> zhangjieNames =issueService.listZhangJie();
        model.addAttribute("zhangjieNames",zhangjieNames);
        System.out.println(viewIssues);
        return "刷题.html";
    }

    /**
     * 详情页举一反三
     * @param kemuId
     * @param jiaocaiId
     * @param zhangjieId
     * @param model
     * @return
     */
    @GetMapping("/details/{kemuId}/{jiaocaiId}/{zhangjieId}")
    public String getIssueRand(@PathVariable("kemuId")String kemuId,
                               @PathVariable("jiaocaiId")String jiaocaiId,
                               @PathVariable("zhangjieId")String zhangjieId,
                               Model model){
        List<ViewIssue> issueRand = issueService.findIssueRand(kemuId,jiaocaiId,zhangjieId);
        model.addAttribute("issue",issueRand);
        return "刷题详情.html";
    }

}
