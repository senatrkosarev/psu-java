package com.skosarev.lab03.part4.task3;

import java.util.Random;

public class Sparrow extends Bird {

    public Sparrow() {
        super("чырык");
    }

    @Override
    public void sing() {
        System.out.println(this.voice);
    }
}
