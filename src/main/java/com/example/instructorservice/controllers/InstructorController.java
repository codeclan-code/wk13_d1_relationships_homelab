package com.example.instructorservice.controllers;


import com.example.instructorservice.models.Instructor;
import com.example.instructorservice.repositories.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/instructors")
public class InstructorController {

    @Autowired
    InstructorRepository instructorRepository;

    @GetMapping
    public List<Instructor> getAllInstructors(){
        return instructorRepository.findAll();
    }
}
