package com.example.team2021.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/back")
public class backController {
    @GetMapping("/index")
    public String getIndex(){
        return "index_3_b";
    }
}
