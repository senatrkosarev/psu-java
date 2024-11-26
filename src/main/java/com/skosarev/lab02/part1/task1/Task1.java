package com.skosarev.lab02.part1.task1;

import com.skosarev.common.ConsoleUtil;

public class Task1 implements RunnableTask {

    private static final int POINT_NUMBER = 3;

    public void run() {
        Point[] arr = new Point[POINT_NUMBER];
        for (int i = 0; i < POINT_NUMBER; i++) {
            long x = ConsoleUtil.readLong("Введи значение X для %d точки: ".formatted(i + 1));
            long y = ConsoleUtil.readLong("Введи значение Y для %d точки: ".formatted(i + 1));
            arr[i] = new Point(x, y);
        }

        System.out.println("Все точки:");
        for (Point p : arr) {
            System.out.println(p);
        }
    }
}
