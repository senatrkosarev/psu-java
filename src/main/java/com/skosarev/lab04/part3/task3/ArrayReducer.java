package com.skosarev.lab04.part3.task3;

import java.util.List;

public class ArrayReducer implements Reducer<List<Integer>, Integer> {

    // Возвращает количество элементов в подсписках
    public Integer reduce(List<List<Integer>> lists) {
        int count = 0;
        for (List<Integer> list : lists) {
            count += list.size();
        }
         return count;
    }
}
