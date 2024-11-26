package com.skosarev.lab04.part3.task1;

import com.skosarev.common.interfaces.RunnableTask;

import java.util.ArrayList;
import java.util.List;

public class Task1 implements RunnableTask {

    @Override
    public void run() {
        System.out.println(doWork(List.of("qwerty", "asdfg", "zx"), new StringToLength()));
        System.out.println(doWork(List.of(1D, -3.7), new Abs()));
        System.out.println(doWork(List.of(new int[]{1, 2, 3, 4}, new int[]{-5, -2, -4}, new int[]{0, 1, 2}), new MaxInArray()));
    }

    public <T, P> List<P> doWork(List<T> list, Applyable<T, P> applyable) {
        List<P> result = new ArrayList<>();
        for (T t : list) {
            result.add(applyable.apply(t));
        }
        return result;
    }
}
