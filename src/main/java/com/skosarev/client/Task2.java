package com.skosarev.client;

import com.skosarev.common.interfaces.RunnableTask;
import com.skosarev.util.functions.AnyPositiveFilter;
import com.skosarev.util.functions.Filter;
import com.skosarev.util.functions.MinLengthFilter;
import com.skosarev.util.functions.PositiveNumberFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 implements RunnableTask {

    @Override
    public void run() {
        System.out.println(doWork(List.of("qwerty", "asdfg", "zx"), new MinLengthFilter(3)));
        System.out.println(doWork(List.of(1D, -3.7), new PositiveNumberFilter()));
        List<int[]> list = doWork(List.of(new int[]{1, 2, 3, 4}, new int[]{-5, -2, -4}, new int[]{0, 1, 2}), new AnyPositiveFilter());
        StringBuilder sb = new StringBuilder("[");
        for (int[] ints : list) {
            sb.append(Arrays.toString(ints)).append(" ");
        }
        System.out.print(sb.toString().trim() + "]");
    }

    public <T> List<T> doWork(List<T> list, Filter<T> filter) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (!filter.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
