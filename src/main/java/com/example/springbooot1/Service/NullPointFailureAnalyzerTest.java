package com.example.springbooot1.Service;

import org.springframework.stereotype.Service;

@Service
public class NullPointFailureAnalyzerTest {

    public NullPointFailureAnalyzerTest(){
        Integer a = null;
//        System.out.println(a.equals("88"));
    }
}
