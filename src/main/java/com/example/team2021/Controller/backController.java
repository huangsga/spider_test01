package com.example.team2021.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("back")
public class backController {
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
    public String alluser(){
        return "all-students_b";
    }
    // 进入用户添加界面
    @GetMapping("adduser")
    public String adduser(){
        return "add-student_b";
    }
    // 进入用户添加界面
    @GetMapping("edituser")
    public String edituser(){
        return "edit-student_b";
    }
    // 进入用户详细界面
    @GetMapping("aboutuser")
    public String detailtuser(){
        return "about-student_b";
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
