package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class StudentController {

    @GetMapping("/students")
    public String getStudentById(@RequestParam(value = "id") int id) {
        return "Hello Students";
    }

}
