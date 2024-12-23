package com.skosarev.lab06.part1.task2;

import java.lang.reflect.Method;

public class Validator {

    public void validate(Object objectToTest, Class<?> t) {
        Method[] testMethods = t.getDeclaredMethods();

        for (Method method : testMethods) {
            try {
                method.invoke(t, objectToTest);
            } catch (Exception e) {
                throw new ValidationException("Объект не прошёл валидацию на методе: " + method.getName() + "; " + e.getCause().getMessage());
            }
        }
    }
}
