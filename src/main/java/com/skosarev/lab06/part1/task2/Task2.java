package com.skosarev.lab06.part1.task2;

import com.skosarev.common.interfaces.RunnableTask;

import java.util.List;

public class Task2 implements RunnableTask {
    @Override
    public void run() {
        Human ivan = new Human("Иван", 30);
        Human sasha = new Human("Саша", 19);
        Human unknownHuman = new Human("", 60);
        Human tooOldHuman = new Human("Баба Яга", 700);

        Validator validator = new Validator();
        List<Human> humans = List.of(ivan, sasha, unknownHuman, tooOldHuman);
        humans.forEach(h -> validator.validate(h, HumanTests.class));
    }
}
