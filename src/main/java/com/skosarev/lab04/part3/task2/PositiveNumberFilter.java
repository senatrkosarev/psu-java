package com.skosarev.lab04.part3.task2;

public class PositiveNumberFilter implements Filter<Double> {
    @Override
    public boolean test(Double number) {
        return number > 0;
    }
}
