package com.skosarev.storage;

public class Box<T> {
    private T value;

    public Box() {
    }

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        if (isEmpty()) {
            return null;
        }
        T value = this.value;
        this.value = null;
        return value;
    }

    public void put(T value) {
        if (!isEmpty()) {
            throw new IllegalStateException("Коробка не пуста");
        }
        this.value = value;
    }

    public boolean isEmpty() {
        return value == null;
    }
}
