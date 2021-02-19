package com.yiming.springboot.controller;

import com.yiming.springboot.entity.Student;
import com.yiming.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object queryByIdStudent(Integer id){
        Student student =studentService.queryByIdStudent(id);
        return student;
    }
}
