package com.sumahto.list.questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> duplicateList = new ArrayList<>();

        IntStream.range(0,10).forEach(i -> duplicateList.add(random.nextInt(0,5)));

        System.out.println("initial List " + duplicateList);
//        removeDuplicate(duplicateList);
        Set<Integer> uniqueSet = duplicateList.stream().collect(Collectors.toSet());

        duplicateList.clear();
        duplicateList.addAll(uniqueSet);

        System.out.println("list after removing duplicates : " + duplicateList);

        List<Integer> unique = duplicateList.stream().distinct().collect(Collectors.toList());
        System.out.println("list after removing duplicates : " + unique);
    }

}
