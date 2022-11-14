package com.newreact.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.newreact.studentsystem.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByUsername(String username);

}
