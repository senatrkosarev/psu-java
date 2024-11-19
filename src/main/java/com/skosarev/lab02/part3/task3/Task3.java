package com.skosarev.lab02.part3.task3;

import com.skosarev.common.interfaces.RunnableTask;

import java.util.List;

public class Task3 implements RunnableTask {

    @Override
    public void run() {
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");

        a.addRelation(f, 1);
        a.addSymmetricRelation(b, 5);
        a.addSymmetricRelation(d, 6);

        b.addSymmetricRelation(c, 3);

        c.addSymmetricRelation(d, 4);

        d.addRelation(e,2);

        e.addSymmetricRelation(f, 2);

        f.addRelation(b, 1);

        printAllRelations(a, b, c, d, e, f);

    }

    private void printAllRelations(City... cities) {
        List.of(cities).forEach(System.out::println);
    }
}
