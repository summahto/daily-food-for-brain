package com.summahto.java8.training.day2;

import com.summahto.java8.training.day1.Employee;
import com.summahto.java8.training.day2.annotation.Writer;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;


@Writer(name = "Sumit", datetime = "02/12/2021")
public class Lab4 {

    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(new Integer[]{10,20,30,20});

        System.out.println("Option1 -------------------");
        for(Integer i : test){
            System.out.println(i);
        }

        System.out.println("Option2 -------------------");
        test.forEach(i -> System.out.println(i));

        System.out.println("Option3 -------------------");
        test.forEach(System.out::println);

        Predicate<String> p1 = s -> s == null ;
        Predicate<Integer> checkGreaterThan1000 = i -> i >1000;
        Predicate<Object> checkInputtype = o -> o instanceof String;
        BiPredicate<Integer, Integer> checkGreater = (i,j) -> i> j;
        BiPredicate<String, String> checkLength = (s1, s2) -> s1.equals(s2);

        Employee e = new Employee("sumit", 1000, 1);
        System.out.println(p1.test("fine"));
        System.out.println(checkGreaterThan1000.test(200));
        System.out.println("input type is String hence : " + checkInputtype.test(e.getName()));
        System.out.println("input type is Integer hence : " +checkInputtype.test(23));
        System.out.println(checkGreater.test(20,10));
        System.out.println(checkLength.test("amit", "sumi"));


        List<String> stringlist = Arrays.asList(new String[]{"Ravi", "Sumit", "amit"});
        BiFunction<List<String>, String, Boolean> isStringPresent = (list, str) -> list.contains(str);

        System.out.println("check if Sumit is present in stringList : " + isStringPresent.apply(stringlist, "Sumit"));
        System.out.println("check if ajay is present in stringList : " + isStringPresent.apply(stringlist, "ajay"));


    }

}
