package com.skosarev.lab04.part2.task3;

import com.skosarev.common.interfaces.RunnableTask;
import com.skosarev.lab02.part1.task1.Point;
import com.skosarev.lab03.part3.task5.Point3D;
import com.skosarev.lab04.part1.task1.Box;

public class Task3 implements RunnableTask {
    @Override
    public void run() {
        Box<Point> box = new Box<>();
        test(box);
        printValue(box);
    }

    // Конструкция Box<? super Point3D>, чтобы можно было параметризовать и с помощью Point, и Point3D
    private void test(Box<? super Point3D> box) {
        box.put(new Point3D(1,2, 3));
    }

    private void printValue(Box<? super Point3D> box) {
        System.out.println("Значение: " + box.get());
    }
}
