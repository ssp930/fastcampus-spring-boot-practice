package com.fastcampus.springbootpractice.service;

import com.fastcampus.springbootpractice.domain.Student;
import com.fastcampus.springbootpractice.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void printStudent(String name) {
        Student student = studentRepository.getStudent(name);
        System.out.println("찾는 학생 : " + student);
    }

    @PostConstruct
    public void init() {
        studentRepository.enroll("jack", 15, Student.Grade.B);
        studentRepository.enroll("fred", 15, Student.Grade.B);
        studentRepository.enroll("cassie", 15, Student.Grade.B);
    }

}
