package com.example.team2021.Controller;

import com.example.team2021.Entity.User;
import com.example.team2021.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String toLogin(HttpSession session){
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "login";
    }

    @GetMapping("/all")
    public String getAllUsers(HttpSession session){
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        userService.listAllUsers();
        return null;
    }

    @GetMapping("/person")
    public String transPerson(HttpSession session){
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "about";
    }
}
