package com.summahto.java8.training.day3;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lab1 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        IntStream.range(1,10).forEach(i -> list.add(random.nextInt(100, 1000)));

//        System.out.println(list);
//
//        list.stream().filter(n -> n> 300 && n<400).forEach(System.out::println);
//        list.stream().sorted().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(4, 2, 8, 9, 5, 6, 7);
        Stream<Integer> numbersGreaterThan5 = numbers.stream().filter(i -> i > 5);
        numbersGreaterThan5.forEach(System.out::println);
        numbersGreaterThan5.forEach(System.out::println);

        Arrays.parallelSort(new int[]{1,2,3});



    }



}
