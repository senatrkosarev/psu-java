package com.skosarev.util.functions;

import java.util.List;

public class ArrayReducer implements Reducer<List<Integer>, Integer> {
    public Integer reduce(List<List<Integer>> lists) {
        int count = 0;
        for (List<Integer> list : lists) {
            count += list.size();
        }
         return count;
    }
}
