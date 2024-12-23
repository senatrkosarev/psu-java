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
        // Создаем объект User с корректными данными
        HumanV2 validUser = new HumanV2("JohnDoe", 25);

        // Проверяем, что метод validate не выбрасывает исключение
        assertDoesNotThrow(() -> validator.validate(validUser));
    }

    @Test
    @DisplayName("Тест на неуспешную валидацию (пустое имя пользователя)")
    public void testValidateUsernameEmpty() {
        // Создаем объект User с пустым именем пользователя
        HumanV2 invalidUser = new HumanV2("", 25);

        // Проверяем, что метод validate выбрасывает исключение с ожидаемым сообщением
        ValidationException exception = assertThrows(ValidationException.class, () -> validator.validate(invalidUser));
        assertTrue(exception.getMessage().contains("не прошёл валидацию на методе: testName"));
    }

    @Test
    @DisplayName("Тест на неуспешную валидацию (некорректный возраст)")
    public void testValidateAgeInvalid() {
        // Создаем объект User с некорректным возрастом
        HumanV2 invalidUser = new HumanV2("JohnDoe", -1);

        // Проверяем, что метод validate выбрасывает исключение с ожидаемым сообщением
        ValidationException exception = assertThrows(ValidationException.class, () -> validator.validate(invalidUser));
        assertTrue(exception.getMessage().contains("не прошёл валидацию на методе: testAge"));
    }
}