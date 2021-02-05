package com.yiming.springboot.web;

import com.yiming.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private School school;

    @RequestMapping(value = "/say")
    public @ResponseBody School say(){
        return school;
    }
}
