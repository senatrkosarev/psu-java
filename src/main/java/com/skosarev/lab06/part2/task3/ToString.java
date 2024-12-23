package com.skosarev.lab06.part2.task3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {
    ToStringValue value() default ToStringValue.YES;
}

enum ToStringValue {
    YES, NO
}