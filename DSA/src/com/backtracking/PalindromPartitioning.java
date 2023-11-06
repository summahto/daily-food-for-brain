package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromPartitioning {

    public static void main(String[] args) {
        String s = "Madam";

        List<List<String>> outer = new ArrayList<>();
        backtrack(outer, new ArrayList<>(), new StringBuilder(), s, 0);

        System.out.println(outer.toString());
    }

    private static void backtrack(List<List<String>> outer, ArrayList<String> inner, StringBuilder curr, String s, int start) {
        if((start) == s.length()){

            outer.add(inner);
            return;

        }

        for(int i= start; i< s.length(); i++){
            curr = curr.append(s.charAt(i));


            if(isPalindrome(curr.toString())){

                inner.add(curr.toString());
                backtrack(outer, inner, new StringBuilder(), s, i + 1);
                inner.remove(inner.size() - 1);

            }
        }
    }

    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() -1;

        while(start <= end){
            if(s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;

    }
}
