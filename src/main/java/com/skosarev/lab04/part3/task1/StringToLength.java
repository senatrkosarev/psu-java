package com.skosarev.lab04.part3.task1;

public class StringToLength implements Applyable<String, Integer>{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}