package com.skosarev.lab03.part4.task3;

public abstract class Bird {
    protected final String voice;

    protected Bird(String voice) {
        this.voice = voice;
    }

    public abstract void sing();
}
