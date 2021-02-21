package com.yiming.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yiming.springboot.entity.Student;
import com.yiming.springboot.entity.StudentExample;
import com.yiming.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceClass = StudentService.class, version = "1.0.0", timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    @Override
    public Student selectById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public Integer queryAllStudentCount() {
        //提升系统性能，用户体验提升
        //首先去redis缓存中查询，如果有：直接使用，如果没有：去数据库查询并存放到redis缓存中
        Integer allStudentCount = (Integer) redisTemplate.opsForValue().get("allStudentCount");
        if (allStudentCount == null) {
            allStudentCount = (int) studentMapper.countByExample(new StudentExample());
            redisTemplate.opsForValue().set("allStudentCount",allStudentCount,30, TimeUnit.SECONDS);
        }
        return allStudentCount;
    }

}
