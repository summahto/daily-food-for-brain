package com.array.test;

public class Test {

    public static void main(String[] args) {
        Integer a ;
        Integer b ;
        a = Integer.valueOf(127);
        b = a;

        System.out.println( b== a);

        a++;

        System.out.println(b==a);

        a--;
        System.out.println(b==a);
        System.out.println("a =" + System.identityHashCode(a));
        System.out.println("b =" + System.identityHashCode(b));

        b = 200;
        a = Math.max(10, 200);

        System.out.println(a == b);

        System.out.println("a =" + System.identityHashCode(a));
        System.out.println("b =" + System.identityHashCode(b));


    }
}
