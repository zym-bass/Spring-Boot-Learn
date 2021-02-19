package com.yiming.springboot.web;

import com.yiming.springboot.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value = "/student")
    public String student(Integer id , Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setId(id);
        student.setName("啦啦啦");
        return student.toString();
    }

    @RequestMapping(value = "/student/detail/{id}/{age}")
    public Object student1(@PathVariable("id") Integer id , @PathVariable("age") Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setId(id);
        student.setName("啦啦啦");
        return student.toString();
    }
}
