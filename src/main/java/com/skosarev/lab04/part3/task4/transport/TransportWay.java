package com.skosarev.lab04.part3.task4.transport;


// Общий интерфейс для всех Способов передачи значений исходного списка в результирующую коллекцию
public interface TransportWay<T> {
    Integer transport(T element);
}
