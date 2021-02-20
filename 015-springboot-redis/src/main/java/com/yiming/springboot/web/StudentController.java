package com.yiming.springboot.web;

import com.yiming.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;




@RestController
public class StudentController {

    @Autowired
    private StudentService studentService ;


    @RequestMapping(value = "/put")
    public  Object put(String key , String value){
        studentService.put(key,value);
        return "Redis集成成功";
    }


    @RequestMapping(value = "/get")
    public String get(String key){
        String value = studentService.get(key);
        return "数据"+key+"为："+value;
    }
}
