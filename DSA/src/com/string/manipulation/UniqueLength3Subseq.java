package com.string.manipulation;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength3Subseq {

    public static void main(String[] args) {
//                  l     r
        String s = "bbcbaba";

        int count = 0, l = 0, r = 2;
        //to store the chars we have seen until now
        HashSet<Character> first = new HashSet<>();

        while(l < s.length() - 2) {

            //keep on adding them to this set so that if another occurrence is found, you ignore it
            //because you would already have considered if seen before
            if (first.add(s.charAt(l))){

                //to store only unique chars when parsing between 2 equal chars l and r
                Set<Character> uniq = new HashSet<>();
                int k = l+1;

                while(r < s.length()){

                    if(s.charAt(l) == s.charAt(r)){
                        // start with k everytime to skip those occurrences which were already checked
                        // hence incrementing k along with i
                        for(int i = k; i< r; i++, k++){

                            if(uniq.add(s.charAt(i)))
                                count++;
                        }
                    }
                    r++;
                }
            }
            //resetting l and r
            l++;
            r = l+2;
        }

//        System.out.println();

        System.out.println(count);


    }
}
