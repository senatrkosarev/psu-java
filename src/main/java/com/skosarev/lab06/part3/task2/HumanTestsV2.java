package com.skosarev.lab06.part3.task2;

import com.skosarev.lab06.part1.task2.ValidationException;

public class HumanTestsV2 {
    public static void testAge(HumanV2 human) {
        if (human.getAge() < 1 || human.getAge() > 200) {
            throw new ValidationException("Возраст человека не в диапазоне от 1 до 200");
        }
    }

    public static void testName(HumanV2 human) {
        if (human.getName().isBlank()) {
            throw new ValidationException("Имя человека пустое");
        }
        if (human.getName().length() > 255) {
            throw new ValidationException("Имя человека слишком длинное");
        }
    }
}
