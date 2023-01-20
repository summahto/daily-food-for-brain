package com.summahto.java8.training.day2.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Writer {
    String name();
    String datetime();

}


