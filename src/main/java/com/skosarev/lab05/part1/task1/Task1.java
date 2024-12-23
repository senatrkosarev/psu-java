package com.skosarev.lab05.part1.task1;

import com.skosarev.common.interfaces.RunnableTask;

public class Task1 implements RunnableTask {
    @Override
    public void run() {
        Fraction fraction = new FractionImpl(1, 5);
        System.out.println("Значение дроби: " + fraction.getRealValue());

        fraction.setValue(1, 20);
        System.out.println("Новое значение дроби: " + fraction.getRealValue());
    }
}
