package com.example.team2021.Controller;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.zhangJie;
import com.example.team2021.Service.issueService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String getIssue(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                           @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                           Model model) {
        /**
         * 查询所有题目
         * @param model
         * @return
         */
        PageInfo<ViewIssue> allIssue = issueService.findAllIssue(pageIndex,pageSize);
//        System.out.println(allIssue);
        model.addAttribute("isShow",false);
        long total = allIssue.getTotal();
        model.addAttribute("issueSize",total);
        model.addAttribute("issue", allIssue);
        /**
         * 获取科目名字
         */
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        return "刷题.html";
    }

    @GetMapping("/main/{kemuId}")
    public String getIssueList(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                               @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                               @PathVariable("kemuId") String kemuId,
                               Model model,HttpServletRequest request) {
        /**
         *带科目参数获取题目
         */
        model.addAttribute("isShow",true);
        HttpSession session = request.getSession(true);
        session.setAttribute("kemuId",kemuId);//把用户数据保存到session对象中
        PageInfo<ViewIssue> issueList = issueService.findIssueList(kemuId,pageIndex,pageSize);
        long total = issueList.getTotal();
        model.addAttribute("issueSize",total);
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
        /**
         * 详情页举一反三
         * 获取三个ID kemuID,jiocaiId,zhangjieId
         * 从三个ID 查到的题目中随机获取三个数据
         * @param kemuId
         * @param jiaocaiId
         * @param zhangjieId
         * @param model
         * @return
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
    public String loadIssues(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                             @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                             @PathVariable("jiaocaiId")String jiaocaiId,
                             @PathVariable("zhangjieId")String zhangjieId,
                             Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        String kemuId = (String) session.getAttribute("kemuId");
//        System.out.println(kemuId);
//        System.out.println(jiaocaiId);
//        System.out.println(zhangjieId);
        PageInfo<ViewIssue> viewIssues = issueService.loadIssues(kemuId, jiaocaiId, zhangjieId,pageIndex,pageSize);
        long total = viewIssues.getTotal();
        model.addAttribute("issueSize",total);
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


}
