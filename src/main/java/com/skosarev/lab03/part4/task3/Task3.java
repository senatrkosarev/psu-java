package com.skosarev.lab03.part4.task3;

import com.skosarev.common.ConsoleUtil;
import com.skosarev.common.interfaces.RunnableTask;

import java.util.List;

public class Task3 implements RunnableTask {
    @Override
    public void run() {
        Bird sparrow = new Sparrow();
        Bird cuckoo = new Cuckoo();
        Bird parrot = new Parrot(ConsoleUtil.readString("Введите реплику попугая: ", false));

        List.of(sparrow, cuckoo, parrot).forEach(Bird::sing);
    }

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        t3.run();
    }
}
