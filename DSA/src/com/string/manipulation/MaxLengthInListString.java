package com.string.manipulation;

import java.util.ArrayList;
import java.util.List;

public class MaxLengthInListString {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sumit");
        list.add("amit");
        list.add("rave");
        list.add("rabbit");
        list.add("boulder");

        System.out.println(maxLength(list));

    }

    private static int maxLength(List<String> list) {

        List <String> res = new ArrayList<>();
        res.add("");
        for(String word: list){
            if (!hasUniqueChars(word)) {
                continue;
            }
            List<String> interim = new ArrayList<>();

            for(String x : res){
                String temp = x + word;
                if (hasUniqueChars(temp)){
                    interim.add(temp);
                }
            }
            res.addAll(interim);
        }
        System.out.println(res);
        int maxLen = 0;
        for (String word : res){
            maxLen = Math.max(maxLen, word.length());
        }
        return maxLen;

    }

    private static boolean hasUniqueChars(String word) {
        boolean [] mask = new boolean[26];
        for(char ch  : word.toCharArray()){
            if(mask[ch - 'a'])
                return false;
            else
                mask[ch -'a'] = true;
        }

        return true;
    }

}



