package service;

import Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

@Service
public class StudentService {


        @Autowired
        private StudentRepository studentRepository;

        public void createStudent(Student student) {

            if (student.getMarks() != null) {
                student.setTotalMarks(student.getMarks());
                student.setAverageMarks(student.getMarks());
                student.setResult(student.getMarks() >= 35 ? "Pass" : "Fail");
            }

            studentRepository.save(student);
        }
    }


