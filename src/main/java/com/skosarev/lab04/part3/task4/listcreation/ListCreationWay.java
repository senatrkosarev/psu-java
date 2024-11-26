package com.skosarev.lab04.part3.task4.listcreation;

import java.util.List;

// Общий интерфейс для всех Способов создания результирующей коллекции
public interface ListCreationWay<T> {
    List<List<T>> createList(List<T> list);
}
