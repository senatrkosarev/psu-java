package com.skosarev.lab04.part3.task4.transport;

// Раскидывает по спискам в зависимости от длины переданной строки
public class StringLengthTransportWay implements TransportWay<String> {
    @Override
    public Integer transport(String element) {
        return element.length();
    }
}
