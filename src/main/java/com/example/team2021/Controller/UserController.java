package com.example.team2021.Controller;

import com.example.team2021.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/login")
    public String getMain(){
        return "index";
    }

}
