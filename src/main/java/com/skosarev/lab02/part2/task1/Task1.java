package com.skosarev.lab02.part2.task1;

import com.skosarev.common.interfaces.RunnableTask;
import com.skosarev.lab02.part1.task1.Point;

import java.util.List;

public class Task1 implements RunnableTask {
    @Override
    public void run() {
        Line l1 = new Line(new Point(1, 3), new Point(23, 8));
        Line l2 = new Line(new Point(5, 10), new Point(25, 10));
        Line l3 = new Line(l1.getP1(), l2.getP2());

        printLines(l1, l2, l3);

        l1.getP1().setX(0);
        l1.getP1().setY(0);
        l2.getP2().setX(1);
        l2.getP2().setY(1);

        printLines(l1, l2, l3);

        l1.setP2(new Point(100, 100));

        printLines(l1, l2, l3);
    }

    public static void printLines(Line... points) {
        List.of(points).forEach(System.out::println);
        System.out.println();
    }
}
