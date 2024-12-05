package com.skosarev.client;

import com.skosarev.common.interfaces.RunnableTask;
import com.skosarev.util.functions.ListCreationWay;
import com.skosarev.util.functions.StringLengthCreationWay;
import com.skosarev.util.functions.TwoSublistsCreationWay;
import com.skosarev.util.functions.UniqueStringsCreationWay;
import com.skosarev.util.functions.PositiveAndNegativeTransportWay;
import com.skosarev.util.functions.StringLengthTransportWay;
import com.skosarev.util.functions.TransportWay;
import com.skosarev.util.functions.UniqueStringsTransportWay;

import java.util.ArrayList;
import java.util.List;

public class Task4 implements RunnableTask {

    @Override
    public void run() {
        List<Double> doubleData = List.of(1d, 2d, -3d, 4d);
        List<String> stringData1 = List.of("qwerty", "asdfg", "zx", "qw");
        List<String> stringData2 = List.of("qwerty", "asdfg", "qwerty", "qw");

        // 1
        List<List<Double>> result1 = doWork(doubleData, new TwoSublistsCreationWay(), new PositiveAndNegativeTransportWay());
        System.out.println(result1);

        // 2
        List<List<String>> result2 = doWork(stringData1, new StringLengthCreationWay(), new StringLengthTransportWay());
        System.out.println(result2);

        // 3
        List<List<String>> result3 = doWork(stringData2, new UniqueStringsCreationWay(), new UniqueStringsTransportWay());
        System.out.println(result3);
    }

    public <T> List<List<T>> doWork(List<T> list, ListCreationWay<T> creationWay, TransportWay<T> transportWay) {
        List<List<T>> createdList = creationWay.createList(list);

        for (T element : list) {
            try {
                createdList.get(transportWay.transport(element)).add(element);
            } catch (IllegalStateException ignored) {}
        }

        List<List<T>> result = new ArrayList<>();
        for (List<T> subList : createdList) {
            if (subList != null) {
                result.add(subList);
            }
        }

        return result;
    }
}
