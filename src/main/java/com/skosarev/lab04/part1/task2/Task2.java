package com.skosarev.lab04.part1.task2;

import com.skosarev.common.ConsoleUtil;
import com.skosarev.common.interfaces.RunnableTask;

public class Task2 implements RunnableTask {
    @Override
    public void run() {
        Storage<Integer> storage1 = new Storage<>(ConsoleUtil.readIntegerMayBeNull());
        printValue(storage1, 0);

        Storage<Integer> storage2 = new Storage<>(ConsoleUtil.readIntegerMayBeNull());
        printValue(storage2, -1);

        Storage<String> storage3 = new Storage<>(ConsoleUtil.readString("Значение: ", true));
        printValue(storage3, "default");

        Storage<String> storage4 = new Storage<>(ConsoleUtil.readString("Значение: ", true));
        printValue(storage4, "hello world");
    }

    static <T> void printValue(Storage<T> storage, T alt) {
        System.out.println("Значение в хранилище: " + storage.getValue(alt));
    }
}
