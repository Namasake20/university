package com.namasake.University.api;

import com.namasake.University.domain.Student;
import com.namasake.University.service.ServiceStudent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.sql.SQLDataException;
import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private ServiceStudent serviceStudent;
    @PostMapping("/student/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/student/save").toUriString());
        return ResponseEntity.created(uri).body(serviceStudent.saveStudent(student));
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() throws SQLDataException {
        return ResponseEntity.ok().body(serviceStudent.getStudents());
    }


}
