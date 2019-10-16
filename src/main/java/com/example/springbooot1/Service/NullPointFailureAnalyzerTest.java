package com.example.springbooot1.Service;

import org.springframework.stereotype.Service;

@Service
public class NullPointFailureAnalyzerTest {

    public NullPointFailureAnalyzerTest(){
        System.out.println("让你有很多冲突");
        Integer a = null;
//        System.out.println(a.equals("88"));
    }
}
