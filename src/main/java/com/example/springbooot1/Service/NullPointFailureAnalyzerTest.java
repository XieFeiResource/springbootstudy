package com.example.springbooot1.Service;

import org.springframework.stereotype.Service;

@Service
public class NullPointFailureAnalyzerTest {

    public NullPointFailureAnalyzerTest(){
        System.out.println("B提交，A来修改制造冲突");
        Integer a = null;
//        System.out.println(a.equals("88"));
    }

    public void methodA(){
        System.out.println("这是方法");
    }

    public void methodB(){
        System.out.println("decelop来啦");
    }

    public void methodC(){
        System.out.println("提交到develop分支的代码");
    }
}
