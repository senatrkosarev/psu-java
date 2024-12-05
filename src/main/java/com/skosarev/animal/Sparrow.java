package com.skosarev.animal;

public class Sparrow extends Bird {

    public Sparrow() {
        super("чырык");
    }

    @Override
    public void sing() {
        System.out.println(this.voice);
    }
}
