package com.summahto.java8.training.day2.annotation;

import com.summahto.java8.training.day2.Lab4;

import java.lang.annotation.Annotation;

public class driver {

    public static void main(String[] args) {
        Class aClass = Lab4.class;
        Annotation[] annotations = aClass.getAnnotations();

        for(Annotation annotation : annotations){
            if(annotation instanceof Writer){
                Writer myAnnotation = (Writer) annotation;
                System.out.println("name: " + myAnnotation.name());
                System.out.println("value: " + myAnnotation.datetime());
            }
        }
    }

}
