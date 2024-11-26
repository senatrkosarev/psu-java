package com.skosarev.lab04.part3.task4.transport;

import java.util.List;


public interface TransportWay<T> {
    Integer transport(T element);
}
