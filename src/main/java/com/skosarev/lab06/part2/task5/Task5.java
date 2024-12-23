package com.skosarev.lab06.part2.task5;

import com.skosarev.common.interfaces.RunnableTask;

@Two(first = "Test", second = 0)
public class Task5 implements RunnableTask {

    @Override
    public void run() {
        System.out.println("Hello world");
    }
}
