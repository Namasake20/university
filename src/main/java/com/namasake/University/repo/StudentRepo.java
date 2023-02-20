package com.namasake.University.repo;

import com.namasake.University.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
    Student findByEmail(String email);
}
