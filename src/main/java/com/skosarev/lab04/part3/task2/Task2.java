package com.skosarev.lab04.part3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public void run() {
        List<String> data1 = List.of("qwerty", "asdfg", "zx");
        List<Double> data2 = List.of(1D, -3.7);
        List<int[]> data3 = List.of(new int[]{1, 2, 3, 4}, new int[]{-5, -2, -4}, new int[]{0, 1, 2});

        // 1
        List<String> result1 = doWork(data1, new MinLengthFilter(3));
        System.out.println(result1);

        // 2
        List<Double> result2 = doWork(data2, new PositiveNumberFilter());
        System.out.println(result2);

        // 3
        // Сначала находим результат, потом выводим в красивом формате
        List<int[]> list = doWork(data3, new AnyPositiveFilter());
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
