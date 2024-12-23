package com.skosarev.lab05.part1.task1;

public class FractionImpl implements Fraction {
    private long numerator;
    private long denominator;
    private double cachedRealValue;

    public FractionImpl(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.cachedRealValue = 1.0 * numerator / denominator;
    }

    @Override
    public String toString() {
        return "%d/%d".formatted(this.numerator, this.denominator);
    }

    public FractionImpl plus(FractionImpl other) {
        return new FractionImpl(this.numerator * other.denominator + other.numerator * this.denominator, this.denominator * other.denominator);
    }

    public FractionImpl minus(FractionImpl other) {
        return new FractionImpl(this.numerator * other.denominator - other.numerator * this.denominator, this.denominator * other.denominator);
    }

    public FractionImpl multiply(FractionImpl other) {
        return new FractionImpl(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public FractionImpl divide(FractionImpl other) {
        return multiply(new FractionImpl(other.denominator, other.numerator));
    }

    @Override
    public double getRealValue() {
        return cachedRealValue;
    }

    @Override
    public void setValue(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.cachedRealValue = 1.0 * numerator / denominator;
    }
}