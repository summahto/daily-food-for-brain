package com.string.manipulation;

import java.util.*;

public class GroupAnagramTest {

    public static void main(String[] args) {

        String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams2(strs));
//        System.out.println(); , "moon", "noom", "onom"

    }


    public static List<List<String>> groupAnagrams2(String[] strs) {

        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (int i =0; i< strs.length ; i++){
            char [] chars = new char[26];

            for(char c : strs[i].toCharArray()){
                chars[c - 'a']++ ;
            }

            String key = new String(chars);
            if (!anagramMap.containsKey(key))
                anagramMap.put(key, new ArrayList<>());

            anagramMap.get(key).add(strs[i]);

        }


        return new ArrayList<>(anagramMap.values());

    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> outer = new ArrayList<>();
        List<String> inner = new ArrayList<>();
        inner.add(strs[0]);
        outer.add(inner);

        for(int i =1 ; i< strs.length; i++){

            int outerLength = outer.size();
            boolean anagramFound = false;

            for(int j=0 ; j< outerLength; j++){
                List<String> innerListI = outer.get(j);

                if(isAnagram(innerListI.get(0), strs[i])){
                    innerListI.add(strs[i]);
                    anagramFound = true;
                    break;
                }

            }

            if(!anagramFound){
                List<String> newInner = new ArrayList<>();
                newInner.add(strs[i]);
                outer.add(newInner);

            }
            System.out.println(outer);
        }

        return outer;

    }

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length())
            return false;

        int [] count = new int[26];

        for(int i = 0 ; i< s.length() ; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0)
                return false;
        }

        return true;
    }
}
