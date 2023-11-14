package com.string.manipulation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SortVowelsInaString {

    public static void main(String[] args) {

        String s = "lEetcOde";

        PriorityQueue<Character> p = new PriorityQueue<>(Comparator.comparingInt(a -> (a - 'A')));
        char[] arr = s.toCharArray();

        for(char c : arr){
            if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c== 'O' || c == 'U') {

                p.offer(c);
            }
        }

        for(int i=0 ; i< s.length() ; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i]== 'o' || arr[i] == 'u'
                    || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i]== 'O' || arr[i] == 'U'){

                arr[i] = p.poll();
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
