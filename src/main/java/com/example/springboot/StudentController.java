/**
 * CopyRight (C)  2017-2018   武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/02/12 16:18
 * ProjectName : springboot
 * Description : 学生控制类
 * Version : V1.0
 */
package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository sr;

    @Autowired
    public StudentController(StudentRepository sr) {
        this.sr = sr;
    }

    @GetMapping(value = "/students")
    public List<Student> studentList(){
        return sr.findAll();
    }

    @PostMapping(value = "/students")
    public Student studentAdd(@RequestParam(value = "sname") String name, @RequestParam(value = "sex") String sex){
        Student student = new Student();
        student.setName("lisi");
        student.setSex("女");

        return sr.save(student);
    }
}
