package com.example.SpringBootTest.student;

import com.example.SpringBootTest.error.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Ben",
                LocalDate.of(1995,2,21),
                "ben.ben@gmail.com"
        ));

    }
}
