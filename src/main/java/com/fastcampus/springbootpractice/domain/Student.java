package com.fastcampus.springbootpractice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Component
public class Student {
    private String name;
    private Integer age;
    private Grade grade;

    public enum Grade {
        A,B,C,D,F
    }
}
