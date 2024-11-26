package com.skosarev.lab04.part3.task4.listcreation;

import java.util.ArrayList;
import java.util.List;

// просто возвращает два подсписка
public class TwoSublistsCreationWay implements ListCreationWay<Double> {
    @Override
    public List<List<Double>> createList(List<Double> list) {
        return List.of(new ArrayList<>(), new ArrayList<>());
    }
}
