package com.skosarev.lab04.part3.task3;

import com.skosarev.common.interfaces.RunnableTask;

import java.util.List;

public class Task3 implements RunnableTask {

    @Override
    public void run() {
        List<String> data1 = List.of("qwerty", "asdfg", "zx");
        List<Double> data2 = List.of(1D, -3.7);
        List<List<Integer>> data3 = List.of(List.of(1, 2, 3, 4), List.of(-5, -2, -4), List.of(0, 1, 2));


        // 1
        System.out.println(doWork(data1, new StringReducer(), "default"));
        // 2
        System.out.println(doWork(data2, new DoubleReducer(), 0d));
        // 3
        System.out.println(doWork(data3, new ArrayReducer(), 0));
    }

    public <T, P> P doWork(List<T> list, Reducer<T, P> reducer, P alternative) {
        // метод не выбросит исключение (условие задания)
        if (list.isEmpty()) {
            return alternative;
        }

        P result = reducer.reduce(list);

        // метод гарантированно не вернет null (условие задания)
        if (result == null) {
            return alternative;
        } else {
            return result;
        }
    }
}
