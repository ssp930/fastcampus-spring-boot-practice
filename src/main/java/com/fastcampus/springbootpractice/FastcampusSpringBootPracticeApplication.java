package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.domain.Student;
import com.fastcampus.springbootpractice.properties.MyProperties;
import com.fastcampus.springbootpractice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;

@EnableCaching
@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

    private final MyProperties myProperties;
    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class,args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init(){
        studentService.printStudent("jack");
        studentService.printStudent("jack");
        studentService.printStudent("jack");
    }
















}
