package com.skosarev.lab06.part3.task1;

import com.skosarev.common.interfaces.RunnableTask;

public class Task1 implements RunnableTask {
    @Override
    public void run() {
        EntityV2 b = new BV2();
        System.out.println(b);
    }
}
