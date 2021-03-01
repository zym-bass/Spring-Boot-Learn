package com.yiming.springboot.web;

import com.yiming.springboot.service.StudentService;


import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@Log
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/count")

    public @ResponseBody String  studentCount(){
        log.info("查询学生人数");

        Long count =studentService.queryStudentCount();

        return "学生总人数为："+count;
    }
}
