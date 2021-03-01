package com.yiming.springboot.service.impl;

import com.yiming.springboot.mapper.StudentMapper;
import com.yiming.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Long queryStudentCount() {

        return studentMapper.countByExample(null);
    }
}
