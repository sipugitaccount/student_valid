package controller;

import Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.StudentRepository;
import service.StudentService;

import javax.validation.Valid;
@RestController


public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/name")
    public ResponseEntity<?> createStudent(@Valid @RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok("Student created successfully");
    }
    }


