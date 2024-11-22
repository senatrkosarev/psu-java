package com.skosarev;

import com.skosarev.common.interfaces.RunnableTask;
import com.skosarev.lab02.part2.task1.Task1;
import com.skosarev.lab02.part5.Task5;

public class Main {
    public static void main(String[] args) {
        RunnableTask task = new Task5();
        task.run();
    }
}