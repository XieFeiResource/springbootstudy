package com.example.springbooot1.Springbootfailureanalyzer;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class NullPointFailureAnalyzer extends AbstractFailureAnalyzer<NullPointerException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, NullPointerException cause) {

        return new FailureAnalysis(cause.getMessage(),"空指针异常",cause);
    }

}
