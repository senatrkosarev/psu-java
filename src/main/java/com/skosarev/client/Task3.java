package com.skosarev.client;

import com.skosarev.common.interfaces.RunnableTask;
import com.skosarev.util.functions.ArrayReducer;
import com.skosarev.util.functions.DoubleReducer;
import com.skosarev.util.functions.Reducer;
import com.skosarev.util.functions.StringReducer;

import java.util.List;

public class Task3 implements RunnableTask {

    @Override
    public void run() {
        System.out.println(doWork(List.of("qwerty", "asdfg", "zx"), new StringReducer(), "default"));
        System.out.println(doWork(List.of(1D, -3.7), new DoubleReducer(), 0d));
        System.out.println(doWork(List.of(List.of(1, 2, 3, 4), List.of(-5, -2, -4), List.of(0, 1, 2)), new ArrayReducer(), 0));
    }

    public <T, P> P doWork(List<T> list, Reducer<T, P> reducer, P alternative) {
        // метод не выбросит исключение
        if (list.isEmpty()) {
            return alternative;
        }

        P result = reducer.reduce(list);

        // метод гарантированно не вернет null
        if (result == null) {
            return alternative;
        } else {
            return result;
        }
    }
}
