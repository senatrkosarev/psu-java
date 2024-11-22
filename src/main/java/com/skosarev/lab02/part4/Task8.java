package com.skosarev.lab02.part4;

import com.skosarev.common.interfaces.RunnableTask;

import java.util.List;

public class Task8 implements RunnableTask {
    @Override
    public void run() {
        CityV2 a = new CityV2("A");
        CityV2 b = new CityV2("B");
        CityV2 c = new CityV2("C");
        CityV2 d = new CityV2("D");
        CityV2 e = new CityV2("E");
        CityV2 f = new CityV2("F");

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

    private void printAllRelations(CityV2... cities) {
        List.of(cities).forEach(System.out::println);
    }
}
