package org.training.springsecurity.Student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/V1/students")
public class StudentManagementController {

    private static  final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"James Bond"),
            new Student(2,"Rambo"),
            new Student(3,"John smith")
    );

    @GetMapping
    public List<Student> getAllStudents(){
        return STUDENTS;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println(student.toString());
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, Student student){
        System.out.println(String.format("%s %s",studentId,student));
    }
}
