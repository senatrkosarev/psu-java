package com.skosarev.lab06.part1.task1;

import com.skosarev.common.interfaces.RunnableTask;

public class Task1 implements RunnableTask {
    @Override
    public void run() {
        B b = new B();
        System.out.println(b);
    }
}
