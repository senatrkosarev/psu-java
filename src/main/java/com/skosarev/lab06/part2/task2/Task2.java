package com.skosarev.lab06.part2.task2;

import com.skosarev.common.interfaces.RunnableTask;

@Default(value = Default.class)
public class Task2 implements RunnableTask {

    @Override
    public void run() {
        System.out.println("Hello world!");
    }
}
