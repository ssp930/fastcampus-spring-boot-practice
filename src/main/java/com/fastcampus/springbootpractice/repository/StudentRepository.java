package com.fastcampus.springbootpractice.repository;

import com.fastcampus.springbootpractice.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.Map;

@RequiredArgsConstructor
@Repository
public class StudentRepository {

    private final Map<String, Student> storage;

    @Cacheable("student")
    public Student getStudent(String name) {
        System.out.println("[repo] 나의 통행료는 무척 비싸다! -> 병목 구간을 의미.");
        return storage.get(name);
    }

    public Student enroll(String name, Integer age, Student.Grade grade) {
        return storage.put(name, Student.of(name, age, grade));
    }
}

