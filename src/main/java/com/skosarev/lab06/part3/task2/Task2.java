package com.skosarev.lab06.part3.task2;

import com.skosarev.common.interfaces.RunnableTask;

public class Task2 implements RunnableTask {
    @Override
    public void run() {
        HumanV2 ivan = new HumanV2("Иван", 30);
        HumanV2 sasha = new HumanV2("Саша", 19);
        HumanV2 unknownHumanV2 = new HumanV2("", 60);
        HumanV2 tooOldHumanV2 = new HumanV2("Баба Яга", 700);

        ValidatorV2 validator = new ValidatorV2();
        validator.validate(ivan, sasha, unknownHumanV2, tooOldHumanV2);
    }
}
