package com.slidingwindow;

import java.util.Arrays;

public class PermutationInString567 {

    public static void main(String[] args) {
        String s1 = "adc", s2 = "dcda";
        System.out.println(checkPermutation(s1, s2));
    }

    private static boolean checkPermutation(String s1, String s2) {

        if(s1.length() > s2.length())
            return false;

        int i = 0, j = 0;
        int [] result = new int[26];
        int [] current = new int[26];

        for(int k =0 ; k< s1.length(); k++){
            result[s1.charAt(k) - 'a']++;
        }

        while (j < s2.length()){

            while(j < s1.length()){
                current[s2.charAt(j) - 'a']++;
                j++;
            }

            if(Arrays.equals(result, current)){
                return true;
            }
            else {
                current[s2.charAt(i) - 'a']--;
                i++;
                current[s2.charAt(j) - 'a']++;
                j++;
            }

        }

        if(Arrays.equals(result, current))
            return true;

        return false;
    }
}
