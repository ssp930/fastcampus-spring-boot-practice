package com.fastcampus.springbootpractice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Component
public class Student { // implements Serializable{
    private String name;
    private Integer age;
    private Grade grade;

    public enum Grade {
        A,B,C,D,F
    }
}
