package com.skosarev.lab02.part1.task3;

import com.skosarev.common.interfaces.RunnableTask;

import java.util.ArrayList;
import java.util.List;

public class Task3 implements RunnableTask {
    @Override
    public void run() {
        List<Name> names = new ArrayList<>();
        names.add(new Name("Клеопатра", null, null));
        names.add(new Name("Александр", "Пушкин", "Сергеевич"));
        names.add(new Name("Владимир", "Маяковский", null));

        names.forEach(System.out::println);
    }
}
