package com.example.team2021.Controller;

import com.example.team2021.Entity.User;
import com.example.team2021.Entity.Ziliaohuizong;
import com.example.team2021.Service.ZiliaohuizongService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("ziliaozongjie")
public class ziliaozongjieController {
    @Autowired
    private ZiliaohuizongService ziliaohuizongService;

    @GetMapping("yuwen")
    public String getziliaozongjieyunwen(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                         @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                         HttpSession session,
//                                         @RequestParam(value = "admin_name",defaultValue = "")String admin_name ,
//                                         @RequestParam(value ="admin_tel",defaultValue = "")String admin_tel ,
                                         Model model){
        PageInfo<Ziliaohuizong> ziliaohuizong = ziliaohuizongService.findAllziliao(pageIndex,pageSize);
        model.addAttribute("ziliaohuizongs",ziliaohuizong);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "course";
    }
    @GetMapping("yingyu")
    public String getziliaoyingyu(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                  HttpSession session,
//                                         @RequestParam(value = "admin_name",defaultValue = "")String admin_name ,
//                                         @RequestParam(value ="admin_tel",defaultValue = "")String admin_tel ,
                                  Model model){
        PageInfo<Ziliaohuizong> ziliaohuizong = ziliaohuizongService.findAllziliaoEn(pageIndex,pageSize);
        model.addAttribute("ziliaohuizongs",ziliaohuizong);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "course";
    }
    @GetMapping("shuxue")
    public String getziliaoshuxue(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                  HttpSession session,
//                                         @RequestParam(value = "admin_name",defaultValue = "")String admin_name ,
//                                         @RequestParam(value ="admin_tel",defaultValue = "")String admin_tel ,
                                  Model model){
        PageInfo<Ziliaohuizong> ziliaohuizong = ziliaohuizongService.findAllziliaoMath(pageIndex,pageSize);
        model.addAttribute("ziliaohuizongs",ziliaohuizong);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "course";
    }
    @GetMapping("wuli")
    public String getziliaowuli(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                HttpSession session,
//                                         @RequestParam(value = "admin_name",defaultValue = "")String admin_name ,
//                                         @RequestParam(value ="admin_tel",defaultValue = "")String admin_tel ,
                                Model model){
        PageInfo<Ziliaohuizong> ziliaohuizong = ziliaohuizongService.findAllziliaoWuli(pageIndex,pageSize);
        model.addAttribute("ziliaohuizongs",ziliaohuizong);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "course";
    }
    @GetMapping("huaxue")
    public String getziliaohuaxue(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                  HttpSession session,
//                                         @RequestParam(value = "admin_name",defaultValue = "")String admin_name ,
//                                         @RequestParam(value ="admin_tel",defaultValue = "")String admin_tel ,
                                  Model model){
        PageInfo<Ziliaohuizong> ziliaohuizong = ziliaohuizongService.findAllziliaoHUaxue(pageIndex,pageSize);
        model.addAttribute("ziliaohuizongs",ziliaohuizong);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "course";
    }
    @GetMapping("lizong")
    public String getziliaoLizong(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                  HttpSession session,
//                                         @RequestParam(value = "admin_name",defaultValue = "")String admin_name ,
//                                         @RequestParam(value ="admin_tel",defaultValue = "")String admin_tel ,
                                   Model model){
        PageInfo<Ziliaohuizong> ziliaohuizong = ziliaohuizongService.findAllziliaoLizong(pageIndex,pageSize);
        model.addAttribute("ziliaohuizongs",ziliaohuizong);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "course";
    }
    @GetMapping("wenzong")
    public String getziliaohuizong(@RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                   HttpSession session,
//                                         @RequestParam(value = "admin_name",defaultValue = "")String admin_name ,
//                                         @RequestParam(value ="admin_tel",defaultValue = "")String admin_tel ,
                                   Model model){
        PageInfo<Ziliaohuizong> ziliaohuizong = ziliaohuizongService.findAllziliaoWenzong(pageIndex,pageSize);
        model.addAttribute("ziliaohuizongs",ziliaohuizong);
        return "course";
    }
    @GetMapping("courseDetail/{id}")
    public String getCourseDetail(@PathVariable("id") Integer ziliaoID,HttpSession session,Model model){
        Ziliaohuizong lists = ziliaohuizongService.findOneziliao(ziliaoID);
        model.addAttribute("info",lists);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "course-detail";
    }
}
