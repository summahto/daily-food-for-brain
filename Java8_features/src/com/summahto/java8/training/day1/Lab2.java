package com.summahto.java8.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Lab2 {

    public static void main(String[] args) {

        List<String> randomStrings = new ArrayList<>();

//        IntStream.range(1,10).forEach(i -> randomStrings.add(generateRandomString()));
//
//        System.out.println(randomStrings);

        randomStrings.add("aa");
        randomStrings.add("bb");
        randomStrings.add("cc");
        randomStrings.add("aaa");
        randomStrings.add("bbb");


        Predicate <String> p = s -> s.startsWith("aa");

        System.out.println(count(randomStrings));
//        System.out.println(countWithCondition(p, randomStrings));

        randomStrings.removeIf(s -> s.startsWith("b"));

        System.out.println(count(randomStrings));

    }

    private static int countWithCondition(Predicate<String> predicate, List<String> randomStrings) {
        int count = 0;
        for (String s: randomStrings){
            if(predicate.test(s))
                count++;
        }
        return count;
    }

    private static int count(List<String> randomStrings) {
        return randomStrings.size();
    }



    private static String generateRandomString() {

        String listOfChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        while(sb.length() <=10){
            int index = (int)(r.nextFloat() * listOfChars.length());
            sb.append(listOfChars.charAt(index));
        }

        return sb.toString();
    }
}
