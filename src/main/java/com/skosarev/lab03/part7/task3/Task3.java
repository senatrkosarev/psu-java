package com.skosarev.lab03.part7.task3;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Task3 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Неверное количество аргументов");
            System.exit(0);
        }
        System.out.println("Результат: " + myPow(args[0], args[1]));
    }

    private static int myPow(String x, String y) {
        int xValue = parseInt(x);
        int yValue = parseInt(y);

        return (int) pow(xValue, yValue);
    }
}
