package com.skosarev.lab04.part3.task3;

import java.util.List;

public class DoubleReducer implements Reducer<Double, Double> {

    // Возвращает сумму всех чисел в списке
    @Override
    public Double reduce(List<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        return sum;
    }
}
