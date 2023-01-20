package com.summahto.list.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class FindDuplicateInArray {

    public static void main(String[] args) {

        int [] a = {1, 1, 2, 3, 8, 4, 5, 6, 7, 8, 8, 10, 6, 4, 4, 8};
        int n = a.length;
        duplicates(a, n);
    }

    private static void duplicates(int[] a, int n) {

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for(int i : a){
            if(!countMap.containsKey(i)) {
                countMap.put(i, 1);
            }else{
                    countMap.put(i, countMap.get(i) +1);
            }
        }


//        System.out.println(countMap);


//        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
//            if(entry.getValue() >= 2){
//                System.out.println("Duplicate element found : " + entry.getKey() + " repeated " + entry.getValue() + " times");
//            }
//        }

        countMap.entrySet().stream()
                .filter(e -> e.getValue() >= 2)
                .forEach(e ->System.out.println("Duplicate element found : " + e.getKey() + " repeated " + e.getValue() + " times"));

//        Stream.of(a); //TODO : parse the array in using streams and put it into a map
    }

}
