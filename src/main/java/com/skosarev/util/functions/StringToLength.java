package com.skosarev.util.functions;

public class StringToLength implements Applyable<String, Integer>{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
