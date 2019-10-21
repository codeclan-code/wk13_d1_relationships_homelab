package com.example.instructorservice;

import com.example.instructorservice.models.Homework;
import com.example.instructorservice.models.Instructor;
import com.example.instructorservice.models.Student;
import com.example.instructorservice.repositories.HomeworkRepository;
import com.example.instructorservice.repositories.InstructorRepository;
import com.example.instructorservice.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class InstructorserviceApplicationTests {

    @Autowired
    InstructorRepository instructorRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    HomeworkRepository homeworkRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void createInstructorAndStudent() {
        Instructor instructor = new Instructor("Miss Jones","instructor");
        Student student1 = new Student("Jimmy", "student", instructor);
    }

    @Test
    public void addStudentsAndHomeworks() {
        Instructor instructor = new Instructor("Miss Smith", "instructor");
        instructorRepository.save(instructor);

        Student student2 = new Student("Korky", "student", instructor);
        studentRepository.save(student2);

        Homework homework1 = new Homework("Maths");
        homeworkRepository.save(homework1);

        Homework homework2 = new Homework("History");
        homeworkRepository.save(homework2);

        homework1.addStudent(student2);
        homeworkRepository.save(homework1);

        homework2.addStudent(student2);
        homeworkRepository.save(homework2);

//		studentRepository.delete(student1);
		}
}



