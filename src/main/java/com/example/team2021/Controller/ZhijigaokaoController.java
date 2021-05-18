package com.example.team2021.Controller;

import com.example.team2021.Entity.User;
import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Entity.Ziliaohuizong;
import com.example.team2021.Service.ZhijigaokaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/zjgk")
public class ZhijigaokaoController {
    @Autowired
    private ZhijigaokaoService zhijigaokaoService;


    @GetMapping("/subject")
    public String getAll(HttpSession session,Model model){
        List<Zhijigaokao> SubjectList = zhijigaokaoService.findSubjectLabelNo();
        List<Zhijigaokao> SubjectAll = zhijigaokaoService.findSubjectAll();
        model.addAttribute("SubjectnameList",SubjectList);
        model.addAttribute("SubjectList",SubjectAll);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "zhijigaokao-list";
    }


    @GetMapping("/ch")
    public String getCh(HttpSession session,Model model){
        List<Zhijigaokao> zhijigaokao =zhijigaokaoService.findAllch1("2019","q1","数学");
        model.addAttribute("zhijigaokao",zhijigaokao);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "zhijigaokao";
    }

    @GetMapping("/subject/{subject}")
    public String getALLSubject(@PathVariable("subject")String subject,HttpSession session,Model model){
        List<Zhijigaokao> SubjectList = zhijigaokaoService.findSubjectLabel(subject);
        List<Zhijigaokao> SubjectnameList = zhijigaokaoService.findSubjectLabelNo();
        model.addAttribute("SubjectList",SubjectList);
        model.addAttribute("SubjectnameList",SubjectnameList);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "zhijigaokao-list";
    }



    @GetMapping("/subjectDetail/{testId}")
    public String getDetail(@PathVariable("testId")String testId,HttpSession session,Model model){
        List<Zhijigaokao> DetailList = zhijigaokaoService.findDetail(testId);
        model.addAttribute("DetailList",DetailList);
        User user=(User)session.getAttribute("us");
        if (user == null) {
            return "redirect:/main/error2";
        };
        return "zhijigaokao-detail";
    }


}




