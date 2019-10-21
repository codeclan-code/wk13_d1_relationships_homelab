package com.example.instructorservice.models;


//RAIDS

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "homeworks")
public class Homework {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject")
    private String subject;

    @JsonIgnoreProperties(value = "homeworks")
    @ManyToMany
    @JoinTable(
            name = "students_homeworks",
            joinColumns = { @JoinColumn(
                    name = "homework_id",
                    nullable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "student_id",
                    nullable = false)
            })
    private List<Student> students;

    public Homework(String subject) {
        this.subject = subject;
        this.students = new ArrayList<>();
    }

    public Homework() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}
