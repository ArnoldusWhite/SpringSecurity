package org.training.springsecurity.Student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/V1/students")
public class StrudentController {

    private static  final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"James Bond"),
            new Student(2,"Rambo"),
            new Student(3,"John smith")
    );

    @GetMapping(path = "/{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer id){
        return STUDENTS.stream()
                .filter(student -> id.equals(student.getId()))
                .findFirst()
                .orElseThrow(()->new IllegalStateException("Student " + id + "does not exists"));
    }
}
