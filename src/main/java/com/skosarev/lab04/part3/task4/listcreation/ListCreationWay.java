package com.skosarev.lab04.part3.task4.listcreation;

import java.util.List;

public interface ListCreationWay<T> {
    List<List<T>> createList(List<T> list);
}
