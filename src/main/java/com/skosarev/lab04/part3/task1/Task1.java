package com.skosarev.lab04.part3.task1;

import com.skosarev.common.interfaces.RunnableTask;

import java.util.ArrayList;
import java.util.List;

public class Task1 implements RunnableTask {

    @Override
    public void run() {
        List<String> data1 = List.of("qwerty", "asdfg", "zx");
        List<Double> data2 = List.of(1D, -3.7);
        List<int[]> data3 = List.of(new int[]{1, 2, 3, 4}, new int[]{-5, -2, -4}, new int[]{0, 1, 2});

        // 1
        System.out.println(doWork(data1, new StringToLengthApplyable()));
        // 2
        System.out.println(doWork(data2, new AbsApplyable()));
        // 3
        System.out.println(doWork(data3, new MaxInArrayApplyable()));
    }

    public <T, P> List<P> doWork(List<T> list, Applyable<T, P> applyable) {
        List<P> result = new ArrayList<>();
        for (T t : list) {
            result.add(applyable.apply(t));
        }
        return result;
    }
}
