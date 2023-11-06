package com.slidingwindow;

import java.util.Arrays;

public class StableSegments {

    public static void main(String[] args) {


//        int [] capacity = {9,3,1,1,1,3,9};
//        int [] capacity = {5,6,1,2,3,6};
//        int [] capacity = {3,3,3,3,3,3,3,3};
        int [] capacity = {9,3,1,2,3,9,10};
        long start = System.nanoTime();
        System.out.println(findNumOfStableSegments(capacity));
        long end = System.nanoTime();
        System.out.println(end - start);

    }


    private static int findNumOfStableSegments(int[] capacity) {


        int l = 0, r = 2, count = 0, n = capacity.length;

        while(l < n-2){

            while(r < n){
                if(capacity[l] != capacity[r]){
                    r++;
                    continue;
                }
                else {
                    int sum = 0, tempL = l+1;
                    while(tempL < r){
                        sum += capacity[tempL];
                        tempL++;
                    }

                    if(sum == capacity[l] && sum == capacity[r]){
                        System.out.println(Arrays.toString(Arrays.copyOfRange(capacity, l, r+1)));
                        count++;
                    }

                }
                r++;
            }

            l++;
            r= l+2;

        }
        return count;


    }
}
