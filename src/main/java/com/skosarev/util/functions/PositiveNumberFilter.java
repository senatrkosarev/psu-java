package com.skosarev.util.functions;

public class PositiveNumberFilter implements Filter<Double> {
    @Override
    public boolean test(Double number) {
        return number > 0;
    }
}
