package com.newreact.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.newreact.studentsystem.model.ApiResponse;
import com.newreact.studentsystem.model.Student;
import com.newreact.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getlogin")
    public List<Student> getLogin(@RequestBody Student student) {

        return studentService.getAllStudents();
    }

    @RequestMapping("/login")
    public ApiResponse login(@RequestBody Student student) {

        ApiResponse apiResponse = studentService.login(student);

        return new ApiResponse(apiResponse.getStatus(), apiResponse.getMessage(), apiResponse.getResult());
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student Credentials added";
    }

}
