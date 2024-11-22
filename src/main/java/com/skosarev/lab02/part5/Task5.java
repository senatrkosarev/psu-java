package com.skosarev.lab02.part5;

import com.skosarev.common.ConsoleUtil;
import com.skosarev.common.interfaces.RunnableTask;

public class Task5 implements RunnableTask {

    @Override
    public void run() {
        /*
        1 3
        2 3
        2 9
         */
        Fraction f1 = new Fraction(ConsoleUtil.readInteger("Введи числитель 1 дроби: "), ConsoleUtil.readInteger("Введи знаменатель 1 дроби: "));
        Fraction f2 = new Fraction(ConsoleUtil.readInteger("Введи числитель 2 дроби: "), ConsoleUtil.readInteger("Введи знаменатель 2 дроби: "));
        Fraction f3 = new Fraction(ConsoleUtil.readInteger("Введи числитель 3 дроби: "), ConsoleUtil.readInteger("Введи знаменатель 3 дроби: "));

        System.out.printf("%s + %s = %s%n", f1, f2, f1.plus(f2));
        System.out.printf("%s - %s = %s%n", f1, f3, f1.minus(f3));
        System.out.printf("%s * %s = %s%n", f2, f3, f2.multiply(f3));
        System.out.printf("%s / %s = %s%n", f1, f3, f1.divide(f3));

        System.out.printf("Результат f1.sum(f2).div(f3).minus(5) = %s%n", f1.plus(f2).divide(f3).minus(new Fraction(5, 1)));

    }
}
