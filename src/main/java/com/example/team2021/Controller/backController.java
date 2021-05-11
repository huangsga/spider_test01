package com.example.team2021.Controller;

import com.example.team2021.Entity.Back;
import com.example.team2021.Service.BackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String library(){
        return "all-library_b";
    }
    // 进入资料添加页面
    @GetMapping("addlibrary")
    public String addlibrary(){
        return "add-library_b";
    }
    // 进入资料编辑页面
    @GetMapping("editlibrary")
    public String editlibrary(){
        return "edit-library_b";
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
    // 进入试题管理界面
    @GetMapping("courses")
    public String courses(){
        return "all-courses_b";
    }
    // 进入试题添加界面
    @GetMapping("addcourses")
    public String addcourses(){
        return "add-courses_b";
    }
    // 进入用户添加界面
    @GetMapping("editcourses")
    public String editcourses(){
        return "edit-courses_b";
    }
    // 进入用户详细界面
    @GetMapping("aboutcourses")
    public String aboutcourses(){
        return "about-courses_b";
    }
}
