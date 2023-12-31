package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "MUDDY RAMADHAN FAKIH",
                        "muddyfakih98@gmail.com",
                        "2022-04-01851",
                        21,
                        LocalDate.of(2002, Month.AUGUST,3)
                )
        );
    }
}
