package com.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(longestSubstringNoRepeats(s));
    }

    public static int longestSubstringNoRepeats(String s){

        if(s.length() == 0 || s== null) return 0;

        int gmax = 0;

        Set<Character> set = new HashSet<>();

        int i =0;
        int j =0;
        while(j < s.length()) {

            if(set.add(s.charAt(j))){
                gmax = Math.max(gmax, j-i+1);
                j++;

            } else {
                set.remove(s.charAt(i));
                i++;
            }

        }


        return gmax;
    }
}
