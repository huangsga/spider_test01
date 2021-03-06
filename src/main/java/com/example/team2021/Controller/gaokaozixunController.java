package com.example.team2021.Controller;

import com.example.team2021.Entity.User;
import com.example.team2021.Entity.gaokaozixun;
import com.example.team2021.Service.gaokaozixunService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("gaokaozixun")
public class gaokaozixunController {
    @Autowired
    private gaokaozixunService gaokaozixunService;

    @RequestMapping("/zixunall")
    public String getZixunall(HttpSession session, Model model){
        List<gaokaozixun> gaokaozixun1=gaokaozixunService.findAlltype();
        List<gaokaozixun> gaokaozixun2=gaokaozixunService.findAlldes();
        model.addAttribute("Type",gaokaozixun1);
        model.addAttribute("Des",gaokaozixun2);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "blog";
    }

    @RequestMapping("/zixunlist")
    public String getZixunValue(
                                @RequestParam(value = "type",defaultValue = "") String  zixunType,
                                @RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                @RequestParam(value = "pageSize",defaultValue = "6")Integer pageSize,
                                HttpSession session,
                                Model model){
        PageInfo<gaokaozixun> gaokaozixun=gaokaozixunService.findAlltitle(zixunType,pageIndex,pageSize);
        model.addAttribute("Gk",gaokaozixun);
        model.addAttribute("typename",zixunType);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "blog-list";
    }

    @GetMapping("zixundetail")
    public String details(@RequestParam("zixunId") Integer zixunId,HttpSession session,Model model){
        List<gaokaozixun> gaokaozixun=gaokaozixunService.findAllbyid(zixunId);
        model.addAttribute("Di",gaokaozixun);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "blog-detail";
    }

    @GetMapping("/zixundetail/{zixunId}")
    public String getZixundetail(@PathVariable("zixunId")Integer zixunId,HttpSession session,Model model){
//        List<gaokaozixun> gaokaozixun=gaokaozixunService.findAllbyid(zixunId);
//        model.addAttribute("Di",gaokaozixun);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "blog-detail";
    }

}
