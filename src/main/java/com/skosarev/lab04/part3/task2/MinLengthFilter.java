package com.skosarev.lab04.part3.task2;

public class MinLengthFilter implements Filter<String> {
    private final int minLength;

    public MinLengthFilter(int minLength) {
        this.minLength = minLength;
    }

    // Длина строки должна быть больше или равна значению, переданному в конструктор при создании
    @Override
    public boolean test(String s) {
        return s.length() < minLength;
    }
}
