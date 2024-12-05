package com.skosarev.animal;

public abstract class Bird {
    protected final String voice;

    protected Bird(String voice) {
        this.voice = voice;
    }

    public abstract void sing();
}
