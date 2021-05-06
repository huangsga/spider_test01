package com.example.team2021.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @className: com.example.team2021.Controller-> baseController
 * @description: 基础控制器
 * @author: 曾豪
 * @createDate: 2021-05-06 10:50
 * @version: 1.0
 * @todo:
 */
@Controller
@ResponseBody
public class baseController {

    @GetMapping("/")
    public String mian(){
        return "index";
    }
}
