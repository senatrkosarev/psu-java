package com.skosarev.lab06.part1.task2;

public class HumanTests {
    public static void testAge(Human human) {
        if (human.getAge() < 1 || human.getAge() > 200) {
            throw new ValidationException("Возраст человека не в диапазоне от 1 до 200");
        }
    }

    public static void testName(Human human) {
        if (human.getName().isBlank()) {
            throw new ValidationException("Имя человека пустое");
        }
        if (human.getName().length() > 255) {
            throw new ValidationException("Имя человека слишком длинное");
        }
    }
}
