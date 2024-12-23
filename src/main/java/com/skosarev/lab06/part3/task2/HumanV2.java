package com.skosarev.lab06.part3.task2;

import com.skosarev.lab06.part2.task4.Validate;

@Validate(value = HumanTestsV2.class)
public class HumanV2 {
    private final String name;
    private final int age;

    public HumanV2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "HumanV2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
