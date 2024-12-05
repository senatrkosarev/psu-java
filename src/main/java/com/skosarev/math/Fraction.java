package com.skosarev.math;

public class Fraction {
    private final long numerator;
    private final long denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "%d/%d".formatted(this.numerator, this.denominator);
    }

    public Fraction plus(Fraction other) {
        return new Fraction(this.numerator * other.denominator + other.numerator * this.denominator, this.denominator * other.denominator);
    }

    public Fraction minus(Fraction other) {
        return new Fraction(this.numerator * other.denominator - other.numerator * this.denominator, this.denominator * other.denominator);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fraction divide(Fraction other) {
        return multiply(new Fraction(other.denominator, other.numerator));
    }
}