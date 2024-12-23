package com.skosarev.lab06.part2.task4;

import com.skosarev.common.interfaces.RunnableTask;

@Validate(value = {})
public class Task4 implements RunnableTask {

    @Override
    public void run() {
        System.out.println("Hello world");
    }
}
