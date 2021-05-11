package com.example.team2021.Controller;

import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Entity.Ziliaohuizong;
import com.example.team2021.Service.ZhijigaokaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/zjgk")
public class ZhijigaokaoController {
    @Autowired
    private ZhijigaokaoService zhijigaokaoService;


    @GetMapping("/subject")
    public String getAll(Model model){
        List<Zhijigaokao> SubjectList = zhijigaokaoService.findSubjectLabelNo();
        List<Zhijigaokao> SubjectAll = zhijigaokaoService.findSubjectAll();
        model.addAttribute("SubjectnameList",SubjectList);
        model.addAttribute("SubjectList",SubjectAll);
        return "zhijigaokao-list";
    }


    @GetMapping("/ch")
    public String getCh(Model model){
        List<Zhijigaokao> zhijigaokao =zhijigaokaoService.findAllch1("2019","q1","数学");
        model.addAttribute("zhijigaokao",zhijigaokao);
        return "zhijigaokao";
    }

    @GetMapping("/subject/{subject}")
    public String getALLSubject(@PathVariable("subject")String subject,Model model){
        List<Zhijigaokao> SubjectList = zhijigaokaoService.findSubjectLabel(subject);
        List<Zhijigaokao> SubjectnameList = zhijigaokaoService.findSubjectLabelNo();
        model.addAttribute("SubjectList",SubjectList);
        model.addAttribute("SubjectnameList",SubjectnameList);
        return "zhijigaokao-list";
    }



    @GetMapping("/subjectDetail/{test_id}")
    public String getDetail(@PathVariable("test_id")String test_id,Model model){
        List<Zhijigaokao> DetailList = zhijigaokaoService.findDetail(test_id);
        model.addAttribute("DetailList",DetailList);
        return "zhijigaokao-detail";
    }


}




