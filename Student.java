package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String fullName;
    private String email;
    private String registrationNumber;

    private Integer age;
    private LocalDate dateOfBirth;
    public Student() {
    }

    public Student(long id,
                   String fullName,
                   String email,
                   String registrationNumber,
                   Integer age,
                   LocalDate dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.registrationNumber = registrationNumber;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String fullName,
                   String email,
                   String registrationNumber,
                   Integer age,
                   LocalDate dateOfBirth) {
        this.fullName = fullName;
        this.email = email;
        this.registrationNumber = registrationNumber;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id: " + id +
                ", fullName: " + fullName +
                ", email: " + email +
                ", registrationNumber: " + registrationNumber +
                ", age: " + age +
                ", dateOfBirth: " + dateOfBirth +
                '}';
    }

}
