package com.yiming.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yiming.springboot.entity.Student;
import com.yiming.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {


    @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = false)
    private StudentService studentService;


    @RequestMapping(value = "/student/detail/{id}")
    public String select(@PathVariable(value = "id") Integer id, Model model) {
        Student student = studentService.selectById(id);
        model.addAttribute("student", student);
        return "index";
    }

    @RequestMapping(value = "/student/detail/count")
    public String queryAllStudentCount(Model model) {
        Integer count =studentService.queryAllStudentCount();
        model.addAttribute("count",count);
        return "index02";
    }

}
