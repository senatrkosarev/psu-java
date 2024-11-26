package com.skosarev.lab04.part3.task4.transport;

// Знает, что будет всего два списка. Раскидывает числа по ним в зависимости от знака числа
public class PositiveAndNegativeTransportWay implements TransportWay<Double> {
    @Override
    public Integer transport(Double element) {
        if (element > 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
