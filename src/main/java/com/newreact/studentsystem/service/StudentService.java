package com.newreact.studentsystem.service;

import java.util.List;

import com.newreact.studentsystem.model.ApiResponse;
import com.newreact.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);

    public ApiResponse login(Student student);

    public List<Student> getAllStudents();
}
