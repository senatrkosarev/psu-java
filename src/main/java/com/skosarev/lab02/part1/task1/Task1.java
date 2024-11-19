package com.skosarev.lab02.part1.task1;

import com.skosarev.common.interfaces.RunnableTask;

public class Task1 implements RunnableTask {
    public void run() {
        Point[] arr = new Point[]{new Point(1, 1), new Point(2, 2), new Point(3, 3)};

        for (Point p : arr) {
            System.out.println(p);
        }
    }
}
