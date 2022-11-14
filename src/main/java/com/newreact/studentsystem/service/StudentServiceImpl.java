package com.newreact.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newreact.studentsystem.model.ApiResponse;
import com.newreact.studentsystem.model.Student;
import com.newreact.studentsystem.repository.StudentRepository;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public ApiResponse login(Student student) {
        student = studentRepository.findByUsername(student.getUsername());
        if (student == null) {
            throw new RuntimeException("User does not exist.");
        }
        if (!student.getPassword().equals(student.getPassword())) {
            throw new RuntimeException("Password mismatch.");
        }
        return new ApiResponse(200, "Login success", null);

    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

}
