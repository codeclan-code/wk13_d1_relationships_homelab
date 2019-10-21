package com.example.instructorservice.controllers;

//RAIDS


import com.example.instructorservice.models.Homework;
import com.example.instructorservice.repositories.HomeworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/homeworks")
public class HomeworkController {

    @Autowired
    HomeworkRepository homeworkRepository;

    @GetMapping
    public List<Homework> getAllHomeworks(){
        return homeworkRepository.findAll();
    }
}
