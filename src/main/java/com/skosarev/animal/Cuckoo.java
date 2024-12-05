package com.skosarev.animal;

import java.util.Random;

public class Cuckoo extends Bird {
    private final Random rn = new Random();

    protected Cuckoo() {
        super("ку-ку");
    }

    @Override
    public void sing() {
        int n = this.rn.nextInt(10) + 1;

        for (int i = 0; i < n; i++) {
            System.out.println(this.voice);
        }
    }
}
