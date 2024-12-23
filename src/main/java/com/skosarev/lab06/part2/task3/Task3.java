package com.skosarev.lab06.part2.task3;

import com.skosarev.common.interfaces.RunnableTask;

@ToString
public class Task3 implements RunnableTask {

    @Override
    public void run() {
        System.out.println("Hello world");
    }
}
