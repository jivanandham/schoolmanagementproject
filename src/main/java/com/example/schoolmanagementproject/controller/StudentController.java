package com.example.schoolmanagementproject.controller;


import com.example.schoolmanagementproject.model.Student;
import com.example.schoolmanagementproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student) {
        studentRepository.insert(student);

    }
    @PostMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentRepository.deleteById(id);
    }
    @GetMapping("/list")
    public List<Student> listStudents() {
        return studentRepository.findAll();
    }



}
