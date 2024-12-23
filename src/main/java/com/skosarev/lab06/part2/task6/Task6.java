package com.skosarev.lab06.part2.task6;

import com.skosarev.common.interfaces.RunnableTask;

@Cache({"Renat", "Skosarev"})
public class Task6 implements RunnableTask {
    @Override
    public void run() {
        System.out.println("Hello world");
    }
}
