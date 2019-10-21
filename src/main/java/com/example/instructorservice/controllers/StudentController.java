package com.example.instructorservice.controllers;


import com.example.instructorservice.models.Student;
import com.example.instructorservice.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/students")

public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
