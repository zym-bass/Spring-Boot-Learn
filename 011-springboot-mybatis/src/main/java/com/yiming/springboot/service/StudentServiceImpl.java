package com.yiming.springboot.service;

import com.yiming.springboot.en.Student;
import com.yiming.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student queryByIdStudent(Integer id){
        Student student = studentMapper.selectByPrimaryKey(id);
        System.out.println("student:"+student);
        return student;
    }
}
