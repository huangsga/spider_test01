package com.example.team2021.Controller;

import com.example.team2021.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 转发到登录页面
     * @return
     */
    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    /**
     * 用户登录事件
     * @param model
     * @param request
     * @return
     */
//    @PostMapping("/doLogin")
//    public String doLogin(Model model,HttpServletRequest request){
//
//        return userService.doLogin(model,request);
//    }

    /**
     * 转发到注册页面
     * @return
//     */
//    @GetMapping("/register")
//    public String toRegister(){
//        return "register.html";
//    }

    /**
//     * 用户注册事件
//     * @param model
//     * @param request
//     * @return
//     */
//    @PostMapping("/doRegister")
//    public String doRegister(Model model, HttpServletRequest request){
//        return  userService.doRegister(model,request);
//    }


    @GetMapping("all")
    public void getAllUsers(){
        userService.listAllUsers();
    }

    @GetMapping("/person")
    public String transPerson(){
        return "about";
    }
}
