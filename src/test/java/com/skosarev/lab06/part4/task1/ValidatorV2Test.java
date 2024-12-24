package com.skosarev.lab06.part4.task1;

import com.skosarev.lab06.part1.task2.ValidationException;
import com.skosarev.lab06.part3.task2.HumanV2;
import com.skosarev.lab06.part3.task2.ValidatorV2;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorV2Test {

    private final ValidatorV2 validator = new ValidatorV2();

    @Test
    @DisplayName("Тест на успешную валидацию")
    public void testValidateSuccessful() {
        // Создаем объект Human с корректными данными
        HumanV2 validHuman = new HumanV2("JohnDoe", 25);

        // Проверяем, что метод validate не выбрасывает исключение
        assertDoesNotThrow(() -> validator.validate(validHuman));
    }

    @Test
    @DisplayName("Тест на неуспешную валидацию (пустое имя пользователя)")
    public void testValidateNameEmpty() {
        // Создаем объект Human с пустым именем пользователя
        HumanV2 invalidHuman = new HumanV2("", 25);

        // Проверяем, что метод validate выбрасывает исключение с ожидаемым сообщением
        ValidationException exception = assertThrows(ValidationException.class, () -> validator.validate(invalidHuman));
        assertTrue(exception.getMessage().contains("не прошёл валидацию на методе: testName"));
    }

    @Test
    @DisplayName("Тест на неуспешную валидацию (некорректный возраст)")
    public void testValidateAgeInvalid() {
        // Создаем объект Human с некорректным возрастом
        HumanV2 invalidHuman = new HumanV2("Ivan", -1);

        // Проверяем, что метод validate выбрасывает исключение с ожидаемым сообщением
        ValidationException exception = assertThrows(ValidationException.class, () -> validator.validate(invalidHuman));
        assertTrue(exception.getMessage().contains("не прошёл валидацию на методе: testAge"));
    }
}