package com.fastcampus.springbootpractice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConstructorBinding
@ConfigurationProperties("my")
//@Configuration
public class MyProperties {

    /**나의 키를 알려줍니다.*/
    private final Integer height;

    public MyProperties(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

//    public void setHeight(Integer height) {
//        this.height = height;
//    }

}

