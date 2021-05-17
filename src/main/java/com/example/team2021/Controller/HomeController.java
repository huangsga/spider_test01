package com.example.team2021.Controller;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Service.issueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/main")
public class HomeController {
    @Autowired
    private issueService issueService;

    @GetMapping("/index")
    public String getIssue(Model model, HttpServletRequest request){
        /**
         * 获取刷题的科目名称
         */
        List<ViewIssue> kemuName = issueService.findKemuName();
        model.addAttribute("kemuName", kemuName);
        HttpSession session = request.getSession(true);
        Object loginState = session.getAttribute("loginState");
        if (loginState !=null){
            boolean isLogin = (boolean) loginState;
            if (!isLogin){
                session.setAttribute("loginState",false);//把用户数据保存到session对象中
            }
        }

        return "index-1";
    }



}
