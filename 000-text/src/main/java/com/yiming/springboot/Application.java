package com.yiming.springboot;

import com.yiming.springboot.entity.Student;
import com.yiming.springboot.mapper.StudentMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        /*StudentMapper studentMapper = (StudentMapper) run.getBean("studentMapper");
        studentMapper.countsum().forEach(s -> {
            System.out.println(s.get姓名() + " " + s.get学号() + " " + s.get总成绩());
        });

        System.out.println("-------------");

        List<Student> students = studentMapper.sumStudent();
        for (int i = 0; i < students.size() - 1; i++) {
            for (int x = i + 1; x < students.size(); x++) {
                if (Double.valueOf(students.get(i).get总成绩()) < Double.valueOf(students.get(x).get总成绩())) {
                    Student student = students.get(i);
                    students.set(i, students.get(x));
                    students.set(x, student);
                } else if (Double.valueOf(students.get(i).get总成绩()) == Double.valueOf(students.get(x).get总成绩())) {
                    if (Double.valueOf(students.get(i).get学号()) < Double.valueOf(students.get(x).get学号())) {
                        Student student = students.get(i);
                        students.set(i, students.get(x));
                        students.set(x, student);
                    }
                }
            }
        }

        students.forEach(s -> {
            System.out.println(s.get姓名() + " " + s.get学号() + " " + s.get总成绩());
        });*/



        File file = new File("E:\\student.csv");
        String line;
        List<Student> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                Integer i = 0;
                for (String arg : split) {

                    try {
                        if (Integer.valueOf(arg) > 0 && Integer.valueOf(arg) <= 100) {
                            i = i + Integer.valueOf(arg);
                        }
                    } catch (NumberFormatException e) {

                    }
                }

                Student student = new Student(split[0], split[1], i.toString());
                list.add(student);
            }
            list.forEach(s -> {
                System.out.println(s.get姓名() + " " + s.get学号() + " " + s.get总成绩());
            });
            System.out.println("-----------------");
            List<Student> students = new ArrayList<>();

            while (list.size()>0){
                Student student = list.get(0);
                for (Student a: list) {
                    if ((Integer.valueOf(student.get总成绩()) < Integer.valueOf(a.get总成绩()))) {
                        student=a;
                    } else if (Integer.valueOf(student.get总成绩()).equals(Integer.valueOf(a.get总成绩()) ) && Integer.valueOf(student.get学号()) < Integer.valueOf(a.get学号())) {
                        student=a;
                    }
                }
                students.add(student);
                list.remove(student);
            }

            students.forEach(s -> {
                System.out.println(s.get姓名() + " " + s.get学号() + " " + s.get总成绩());
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
