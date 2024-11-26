package com.skosarev.lab04.part1.task1;

import com.skosarev.common.ConsoleUtil;
import com.skosarev.common.interfaces.RunnableTask;

public class Task1 implements RunnableTask {
    @Override
    public void run() {
        int value = ConsoleUtil.readInteger();
        Box<Integer> box = new Box<>(value);
        printValue(box);
    }

    static void printValue(Box<Integer> box) {
        Integer value = box.get();
        System.out.println("Значение из коробки: " + value);
    }
}
