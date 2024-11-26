package com.skosarev.lab04.part3.task3;

import java.util.List;

public interface Reducer<T, P> {
    P reduce(List<T> list);
}
