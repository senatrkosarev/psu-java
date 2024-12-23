package com.skosarev.lab06.part2.task1;

import com.skosarev.common.interfaces.RunnableTask;

public class Task1 implements RunnableTask {

    @Override
    @Invoke
    public void run() {
        System.out.println("Hello world");
    }
}
