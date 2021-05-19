package com.example.team2021.Controller;

import com.example.team2021.Entity.*;
import com.example.team2021.Service.BackService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("back")
public class backController {
    @Autowired
    private BackService backService;
    // 进入后台主页面
    @GetMapping("index")
    public String getIndex(){
        return "index_3_b";
    }
    // --------------------------------------------------------------------------------
    // 进入资料管理页面
    @GetMapping("library")
    public String library(Model model){
        List<Ziliaohuizong> ziliaoInfo = backService.findalllibary();
        model.addAttribute("ziliaoInfo",ziliaoInfo);
        return "all-library_b";
    }
    // 进入资料添加页面
    @GetMapping("addlibrary")
    public String addlibrary(){
        return "add-library_b";
    }
    // 进入资料编辑页面
    @GetMapping("editlibrary/{id}")
    public String editlibrary(@PathVariable("id") Integer ziliaoID,Model model){
        Ziliaohuizong ziliaoInfo = backService.updatefindziliao(ziliaoID);
        model.addAttribute("ziliaoinfo",ziliaoInfo);
        return "edit-library_b";
    }
    //资料更新
    @PostMapping("editlibrary")
    public String editliba(Ziliaohuizong ziliaohuizong){
        backService.updateziliao(ziliaohuizong);
        return "redirect:/back/library";
    }
    // 资料删除
    @GetMapping("deletelibrary/{id}")
    public String deletelibrary(@PathVariable("id") Integer ziliaoID){
        backService.deleteZiliaoinfo(ziliaoID);
        return "redirect:/back/library";
    }
    // --------------------------------------------------------------------------------
    // 进入用户管理界面
    @GetMapping("alluser")
    public String alluser(Model model){
        List<Back> userInfo =  backService.findalluser();
        model.addAttribute("usrInfo",userInfo);
        return "all-students_b";
    }
    // 进入用户添加界面
    @GetMapping("adduser")
    public String adduser(){
        return "add-student_b";
    }
    @PostMapping("adduser")
    public String adduser(Back back){
        backService.adduserinfo(back);
        return "redirect:/back/alluser";
    }
    // 进入用户信息修改界面
    @GetMapping("/edituser/{id}")
    public String eidtuser(@PathVariable("id") Integer userid,Model model){
        Back oneuserinfo=backService.findoneuser(userid);
        model.addAttribute("usereidtinfo",oneuserinfo);
        return "edit-student_b";
    }
    // 提交用户信息修改
    @PostMapping("edituser")
    public String edituser(Back back){
        backService.edituserinfo(back);
        return "redirect:/back/alluser";
    }
    // 进入用户详细界面
    @GetMapping("aboutuser")
    public String detailtuser(){
        return "about-student_b";
    }
    // 删除用户
    @GetMapping("/delete/{id}")
    public String deleteuserinfo(@PathVariable("id") Integer userid){
        backService.deleteUserinfo(userid);
        return "redirect:/back/alluser";
    }

    // --------------------------------------------------------------------------------
    // 进入真题管理界面
    @GetMapping("courses")
    public String courses(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                          @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                          Model model){
        PageInfo<Zhijigaokao> zhentiList = backService.findAllzhenti(pageIndex,pageSize);
        model.addAttribute("zhentiList",zhentiList);
        return "all-courses_b";
    }
    // 进入真题添加界面
    @GetMapping("addcourses")
    public String addcourses(){
        return "add-courses_b";
    }
    // 删除真题
    @GetMapping("/deleteZhenti/{picId}")
    public String deleteZhenti(@PathVariable("picId") Integer picId){
        backService.deleteZhenti(picId);
        return "redirect:/back/courses";
    }
    // 进入真题添加界面
    @GetMapping("editcourses")
    public String editcourses(){
        return "edit-courses_b";
    }
    // 进入真题详细界面
    @GetMapping("aboutcourses")
    public String aboutcourses(){
        return "about-courses_b";
    }

    // --------------------------------------------------------------------------------
    // 进入试题管理界面
    @GetMapping("backIssues")
    public String getBackIssues(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                Model model){
        PageInfo<ViewIssue> issuesList = backService.findAllIssue(pageIndex,pageSize);
        model.addAttribute("issuesList",issuesList);
        return "all-subjects_b";
    }
    // 删除试题
    @GetMapping("/deleteIssues/{shitiId}")
    public String deleteIssues(@PathVariable("shitiId") Integer shitiId){
        backService.deleteIssue(shitiId);
        return "redirect:/back/backIssues";
    }
    // 进入试题添加界面
    @GetMapping("editIssues")
    public String editIssues(){
        return "edit-subjects_b";
    }
    // 进入试题详细界面
    @GetMapping("aboutIssues")
    public String aboutIssues(){
        return "about-subjects_b";
    }

    // --------------------------------------------------------------------------------
    // 进入资讯管理界面
    @GetMapping("department")
    public String findzixun(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                            @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                            Model model){
        PageInfo<gaokaozixun> gaokaozixun=backService.findAllzixun(pageIndex,pageSize);
        model.addAttribute("gaokaozixun",gaokaozixun);
        return "all-departments_b";}






}
