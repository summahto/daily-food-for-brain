package com.slidingwindow;


import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class LongestRepeatingCharacterReplacement_424 {

    public static void main(String[] args) {
        String s = "AABABBA";
//        String s = "AABAABBBB";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }

    private static int characterReplacement(String s, int k) {


        int start = 0, end = 0;
        int maxCount = 0;
//        int otherCharsCount = 0;
        int maxLength = 0;
        int [] count = new int[26];
//        int i = 0;
//      0 1 2 3 4 5 6
//      A A B A B B A - this test case
        while (end < s.length()){
//            System.out.println("--------");
//            System.out.println("iteration " + (++i));


            count[s.charAt(end) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(end) - 'A']);


            if( (end - start + 1) <= (maxCount + k) ){
                maxLength = Math.max(maxLength, end - start +1);


            } else {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            end++;

        }

        return maxLength;
    }

    private static int characterReplacement2(String s, int k){
        int start = 0, end = 0, maxCount = 0, maxLength = 0;
        int [] count = new int[26];

        while (end < s.length()){

            count[s.charAt(end) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(end) - 'A'] );

            System.out.println(Arrays.toString(count));

            while((end - start +1) > maxCount + k){
                count[s.charAt(start) - 'A']--;
                start++;

            }

            maxLength = Math.max(maxLength, (end - start +1));
            end++;
        }

        return maxLength;
    }

}
