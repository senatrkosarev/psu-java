package com.skosarev.storage;

public class Storage<T> {
    private final T value;

    public Storage(T value) {
        this.value = value;
    }

    public T getValue(T alt) {
        if (isEmpty()) {
            return alt;
        }
        return value;
    }

    public boolean isEmpty() {
        return value == null;
    }
}
