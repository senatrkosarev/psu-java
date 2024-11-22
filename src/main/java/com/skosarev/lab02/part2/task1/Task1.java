package com.skosarev.lab02.part2.task1;

import com.skosarev.common.ConsoleUtil;
import com.skosarev.common.interfaces.RunnableTask;
import com.skosarev.lab02.part1.task1.Point;

import java.util.List;

public class Task1 implements RunnableTask {
    @Override
    public void run() {
        /*
        1 3
        23 8
        5 10
        25 10

        0 0
        1 1
        100 100
         */
        Line l1 = new Line(readPoint(), readPoint());
        Line l2 = new Line(readPoint(), readPoint());
        Line l3 = new Line(l1.getP1(), l2.getP2());

        printLines(l1, l2, l3);

        l1.getP1().setX(ConsoleUtil.readLong("Введи новое значение X для точки 1 линии 1: "));
        l1.getP1().setY(ConsoleUtil.readLong("Введи новое значение Y для точки 1 линии 1: "));
        l2.getP2().setX(ConsoleUtil.readLong("Введи новое значение X для точки 2 линии 2: "));
        l2.getP2().setY(ConsoleUtil.readLong("Введи новое значение Y для точки 2 линии 2: "));

        printLines(l1, l2, l3);

        l1.setP2(readPoint());

        printLines(l1, l2, l3);
    }

    public static void printLines(Line... points) {
        List.of(points).forEach(System.out::println);
        System.out.println();
    }

    public Point readPoint() {
        long x = ConsoleUtil.readLong("Введи значение X: ");
        long y = ConsoleUtil.readLong("Введи значение Y: ");
        return new Point(x, y);
    }
}
