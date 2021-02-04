package com.yiming.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value = "/spring/say")
    @ResponseBody
    public String say(){
        return "hello springboot";
    }
}
