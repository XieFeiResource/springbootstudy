package com.example.springbooot1.Components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Mybean implements CommandLineRunner {

    public void run(String... args) {
        System.out.println("do something");
    }

}