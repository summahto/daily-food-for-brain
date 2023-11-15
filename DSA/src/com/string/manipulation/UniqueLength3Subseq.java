package com.string.manipulation;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength3Subseq {

    public static void main(String[] args) {
//                  l     r
        String s = "bbcbaba";

        int count = 0, l = 0, r = 2;
        HashSet<Character> first = new HashSet<>();

        while(l < s.length() - 2) {

            if (first.add(s.charAt(l))){

                Set<Character> uniq = new HashSet<>();
                int k = l+1;
                while(r < s.length()){

                    if(s.charAt(l) == s.charAt(r)){

                        for(int i = k; i< r; i++, k++){

                            if(uniq.add(s.charAt(i)))
                                count++;
                        }
                    }
                    r++;
                }
            }
            l++;
            r = l+2;
        }

//        System.out.println();

        System.out.println(count);


    }
}
