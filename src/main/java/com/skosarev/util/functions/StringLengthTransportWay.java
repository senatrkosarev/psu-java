package com.skosarev.util.functions;

public class StringLengthTransportWay implements TransportWay<String> {
    @Override
    public Integer transport(String element) {
        return element.length();
    }
}
