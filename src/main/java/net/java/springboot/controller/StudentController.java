package net.java.springboot.controller;

import net.java.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("student")
    public Student getStudent(){
        Student std = new Student(2,"Murli","Patel");
        return std;
    }
}
