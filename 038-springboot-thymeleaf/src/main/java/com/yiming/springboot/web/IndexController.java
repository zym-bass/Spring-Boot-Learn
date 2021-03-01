package com.yiming.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/detail")
    public String detail(Model model){
        model.addAttribute("data","Springboot集成Thymeleaf02-消除页面缓存");
        return "message";
    }
}
