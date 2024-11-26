package com.skosarev.lab04.part3.task2;

public class AnyPositiveFilter implements Filter<int[]> {
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
