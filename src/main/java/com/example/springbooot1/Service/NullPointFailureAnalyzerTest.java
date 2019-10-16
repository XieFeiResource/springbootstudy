package com.example.springbooot1.Service;

import org.springframework.stereotype.Service;

@Service
public class NullPointFailureAnalyzerTest {

    public NullPointFailureAnalyzerTest(){
        System.out.println("B提交，A来修改制造冲突");
        Integer a = null;
//        System.out.println(a.equals("88"));
    }
}
