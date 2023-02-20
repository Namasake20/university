package com.namasake.University.service;

import com.namasake.University.domain.Student;
import com.namasake.University.repo.StudentRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;
import java.util.List;


@Service @AllArgsConstructor
@Slf4j @Transactional
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;

    @Override
    public Student addStudent(Student student) {
        log.info("saving new student {}"+" to database",student.getEmail());
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getStudents() {
        log.info("fetching all students");
        return studentRepo.findAll();
    }
}
