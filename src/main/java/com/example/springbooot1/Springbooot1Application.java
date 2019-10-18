package com.example.springbooot1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbooot1.Mapper")
public class Springbooot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbooot1Application.class, args);
        System.out.println("springbootapplication");
    }

}
