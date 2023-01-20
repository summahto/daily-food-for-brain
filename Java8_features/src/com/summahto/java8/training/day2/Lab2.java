package com.summahto.java8.training.day2;

import java.util.Arrays;
import java.util.List;

interface Process {
    public int sum(List<Integer> list);
}

public class Lab2 {

    public static void main(String[] args) {

        Process p1 = list -> {
            int sum = 0;
            for (int num : list){
                sum += num;
            }
            return sum;
        };

        System.out.println("Sum :" + p1.sum(Arrays.asList(new Integer[] {10,20,30,40})));
    }


}
