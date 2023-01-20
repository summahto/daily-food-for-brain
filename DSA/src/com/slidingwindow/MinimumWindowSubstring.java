package com.slidingwindow;

import java.util.*;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

//        String s = "ADOBECODEBANC", t = "ABC";
        String s = "ABECCBANC", t = "ABC";
//        String s = "a", t = "b";
//        System.out.println(minWindow(s, t));
        System.out.println(minWindowUsingHashMap(s, t));

    }

    private static String minWindowUsingHashMap(String s, String t) {

        if(t.length() > s.length() || s.length() == 0 || t.length() == 0)
            return "";

        Map<Character, Integer> map = new HashMap<>();
        int start = 0, minStart = 0, end = 0, matched = 0, minLength = Integer.MAX_VALUE;

        for(char c : t.toCharArray())
            map.put(c , map.getOrDefault(c, 0) + 1);

        while (end < s.length()){

            char right = s.charAt(end);
            if(map.containsKey(right)){
                map.put(right, map.get(right) -1);
                if(map.get(right)== 0) matched++;
            }
            end++;

            while (matched == map.size()){
               if(minLength > end - start) {
                   minLength = end - start;
                   minStart = start;
               }
               char removed = s.charAt(start);
               if(map.containsKey(removed)){
                   if(map.get(removed) == 0)matched-- ;
                   map.put(removed, map.get(removed) + 1);
               }
               start++;
            }

        }


        if (minLength == Integer.MAX_VALUE)
            return "";

        return s.substring(minStart, minStart + minLength);


    }

    private static String minWindow(String s, String t) {

        int start = 0, end = 0, minLength = Integer.MAX_VALUE, validStart = 0;
        int [] tracker = new int[128];

        //initialized with the characters of t and it's char count
        for(int i = 0; i< t.length(); i++){
            tracker[t.charAt(i)]++;
        }

        int count = t.length(); //track the number of chars in t

        while (end < s.length()) {
            //if the character in t exists in s then reduce it's count
            if (tracker[s.charAt(end)] > 0)
                count--;

            //reduce the count of character everytime, if it exists in t count for that char will be 0, else -ve
            tracker[s.charAt(end)]--;
            end++;

            //if all the chars in t are present in s, then record the minLength
            while (count == 0) {
                if(minLength > end - start){
                    minLength = end - start;
                    validStart = start;  // update the start only if the minimumLength was found, NOT always
//                    System.out.println("Current  Min Substring  : " + s.substring(validStart, validStart+ minLength));
                }

                //increase the count because we are releasing the character from the window
                tracker[s.charAt(start)]++;

                //if the tracker's value of start is greater than 0, means it is a char present in t, hence update count
                if (tracker[s.charAt(start)] > 0)
                    count++;

                start++;

            }
        }

        if(minLength != Integer.MAX_VALUE)
            return s.substring(validStart, validStart + minLength);

        return "";

    }

    private static boolean containsAll(int[] current, int[] result) {

        StringBuilder sbCurrent = new StringBuilder();
        StringBuilder sbResult = new StringBuilder();

        for (int i = 0; i< result.length; i++){
            while(result[i] > 0){
                sbResult.append((char)(result[i]+i));
                result[i]--;
                }


            while(current[i] > 0){
                sbCurrent.append((char)(current[i]+i));
                current[i]--;
                }
            }


        if(sbCurrent.toString().contains(sbResult.toString()))
            return true;

        return false;
    }

}
