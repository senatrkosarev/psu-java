package com.skosarev.lab02.part1.task3;

import com.skosarev.common.ConsoleUtil;

import java.util.ArrayList;
import java.util.List;

public class Task3 implements RunnableTask {
    @Override
    public void run() {
        List<Name> names = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String name = ConsoleUtil.readString("Имя %d: ".formatted(i + 1), true);
            String surname = ConsoleUtil.readString("Фамилия %d: ".formatted(i + 1), true);
            String patronymic = ConsoleUtil.readString("Отчество %d: ".formatted(i + 1), true);

            names.add(new Name(name, surname, patronymic));
        }

        System.out.println("\nВсе имена: ");
        names.forEach(System.out::println);
    }
}
