package com.yiming.springboot.web;

import com.yiming.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class UsetController {

    @RequestMapping(value = "/login")
    public @ResponseBody
    Object login(HttpServletRequest request ){

        //将用户的信息存放到session中
        User user = new User();
        user.setId(1000);
        user.setName("一名");
        request.getSession().setAttribute("user",user);

        return "login SUCCESS";
    }

    //该请求需要用户登录之后才可访问
    @RequestMapping(value = "/center")
    public @ResponseBody Object center(){
        return "See Center Message";
    }

    //该请求不登录也可以访问
    @RequestMapping(value = "/out")
    public @ResponseBody Object out(){
        return "Out See anytime";
    }

    //如果用户未登录访问了才可以访问的请求，之后会跳转至改请求路径
    @RequestMapping(value = "/error")
    public @ResponseBody Object error(){
        return "error";
    }
}
