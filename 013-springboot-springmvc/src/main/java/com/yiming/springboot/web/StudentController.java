package com.yiming.springboot.web;

import com.yiming.springboot.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @RequestMapping(value = "/say")
    public @ResponseBody Object say(){
        Student student = new Student();
        student.setId(1);
        student.setAge(12);
        student.setName("wangwu");
        return student;
    }


}
