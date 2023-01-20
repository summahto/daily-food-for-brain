package com.summahto.java8.training.day1;

import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {

        Calc1 calc1 = n -> n*n;
        Calc2 calc2 = (a,b) -> a+b;
        Calc3 calc3 = s -> s.length();
        Calc4 calc4 = a -> a%2 == 0;

        System.out.println(calc1.sqr(2));
        System.out.println(calc2.add(19, 21));
        System.out.println(calc3.len("Gerrrraaaard"));
        System.out.println(calc4.checkEven(23));

        Map<String, Integer> map = new HashMap<>();
        map.put("test", 0);
        System.out.println(map);
        map.put("test", map.get("test") +1);
        System.out.println(map);
    }
}
