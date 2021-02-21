package com.yiming.springboot.service;

import com.yiming.springboot.entity.Student;

public interface StudentService {
    Student selectById(Integer id);

    Integer queryAllStudentCount();
}
