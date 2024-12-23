package com.skosarev.lab06.part3.task2;

import com.skosarev.lab06.part1.task2.ValidationException;
import com.skosarev.lab06.part2.task4.Validate;

import java.lang.reflect.Method;

public class ValidatorV2 {
    public void validate(Object... objectsToTest) throws ValidationException {
        for (Object objectToTest : objectsToTest) {
            Class<?> clazz = objectToTest.getClass();

            // Проверяем наличие аннотации @Validate
            if (clazz.isAnnotationPresent(Validate.class)) {
                Validate validateAnnotation = clazz.getAnnotation(Validate.class);
                Class<?>[] testClasses = validateAnnotation.value();

                // Проходим по всем классам тестов
                for (Class<?> testClass : testClasses) {
                    Method[] testMethods = testClass.getDeclaredMethods();

                    for (Method method : testMethods) {
                        try {
                            method.invoke(validateAnnotation.value()[0], objectToTest);
                        } catch (Exception e) {
                            throw new ValidationException("Объект " + objectToTest + " не прошёл валидацию на методе: " + method.getName() + "; " + e.getMessage());
//                            System.out.println("Объект " + objectToTest + " не прошёл валидацию на методе: " + method.getName() + "; " + e.getCause().getMessage());
                        }
                    }
                }
            } else {
                throw new ValidationException("Класс " + clazz.getSimpleName() + " не имеет аннотации @Validate");
            }
        }
    }
}
