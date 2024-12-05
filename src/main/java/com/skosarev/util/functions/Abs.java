package com.skosarev.util.functions;

public class Abs implements Applyable<Double, Double>{
    @Override
    public Double apply(Double aDouble) {
        return Math.abs(aDouble);
    }
}
