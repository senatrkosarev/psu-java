package com.skosarev.lab04.part3.task4.transport;

import java.util.HashMap;
import java.util.Map;

// Раскидывает по спискам в зависимости от уникальности переданной строки
public class UniqueStringsTransportWay implements TransportWay<String> {
    private Map<String, Integer> stringToIndexMap = new HashMap<>();

    @Override
    public Integer transport(String element) {
        // Если строка уже была добавлена в Map, кидаем исключение, чтобы в результате не было дубликатов
        if (stringToIndexMap.containsKey(element)) {
            throw new IllegalStateException();
        } else {
            // Если строка новая, добавляем её в Map и возвращаем новый индекс
            int newIndex = stringToIndexMap.size();
            stringToIndexMap.put(element, newIndex);
            return newIndex;
        }
    }
}
