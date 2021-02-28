package com.yiming.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {


    @RequestMapping(value = "/detail")
    public @ResponseBody String userDetail(){
        return "detail";
    }

    @RequestMapping(value = "/user/center")
    public @ResponseBody String center(){
        return "/user/center";
    }
}
