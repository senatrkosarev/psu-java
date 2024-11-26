package com.skosarev.lab04.part3.task2;

public class AnyPositiveFilter implements Filter<int[]> {

    // Хотя бы один элемент массива должен быть положительным
    @Override
    public boolean test(int[] ints) {
        for (int num : ints) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }
}
