package com.firstproject.springboot.controller;

import com.firstproject.springboot.dto.PspAndBrand;
import com.firstproject.springboot.dto.PspAndName;
import com.firstproject.springboot.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public void getAllStudents(){
        studentRepository.findAllStudentDetails();
    }
    @GetMapping("/students/brand")
    public List<PspAndBrand> getAllStudentsByBrand() {
        return studentRepository.findStudentPspAndBrand();
    }


}
