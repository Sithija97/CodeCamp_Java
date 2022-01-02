package com.example.crud.app.controller;

import com.example.crud.app.model.Student;
import com.example.crud.app.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping(value="/all")
    public List<Student> getAllStudents() {
        return  studentRepository.findAll();
    }

    @PostMapping(value="/create")
    public String CreateStudent(@RequestBody Student student) {
        Student insertedStudent = studentRepository.insert(student);
        return "Student Created "+ insertedStudent.getName();
    }

}
