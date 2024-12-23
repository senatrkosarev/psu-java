package com.skosarev.lab04.part3.task1;


public class MaxInArray implements Applyable<int[], Integer> {
    @Override
    public Integer apply(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
