package com.example.team2021.Controller;

import com.example.team2021.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class HomeController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 转发到登录页面
     * @return
     */
    @GetMapping("/login")
    public String getMain(){
        return "index-1";
    }

    @GetMapping("paper")
    public String getPaper(){

        return "blog-list";
    }

}
