package com.yiming.springboot.controller;

import com.yiming.springboot.en.Student;
import com.yiming.springboot.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object student(Integer id){
        Student student = studentService.queryByIdStudent(id);

        return studentService.queryByIdStudent(id);
    }
}
