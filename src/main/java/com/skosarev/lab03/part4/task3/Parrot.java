package com.skosarev.lab03.part4.task3;

import java.util.Random;

public class Parrot extends Bird {
    private final Random rn = new Random();

    protected Parrot(String voice) {
        super(voice);
    }

    @Override
    public void sing() {
        int n = this.rn.nextInt(this.voice.length()) + 1;
        System.out.println(this.voice.substring(0, n));
    }
}
