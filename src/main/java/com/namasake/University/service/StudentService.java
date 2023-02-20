package com.namasake.University.service;

import com.namasake.University.domain.Student;

import java.util.List;


public interface StudentService {
    Student addStudent(Student student);
    List<Student> getStudents();

}
