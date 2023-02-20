package com.namasake.University.service;

import com.namasake.University.domain.Student;
import com.namasake.University.repo.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;

@Service @Slf4j
public class ServiceStudent {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student){
        log.info("saving new student {} to database",student.getEmail());
       return studentRepo.save(student);
    }

    public List<Student> getStudents() throws SQLDataException {
        log.info("Fetching all students from the database");
        return studentRepo.findAll();
    }
}
