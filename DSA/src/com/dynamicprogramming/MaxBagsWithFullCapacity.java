package com.dynamicprogramming;

import java.util.Arrays;

public class MaxBagsWithFullCapacity {

    public static void main(String[] args) {
        int [] capacity = {2,3,4,5};
        int [] rocks = {1,2,4,4};
        int additionalRocks = 2;
        System.out.println(maximumBags(capacity, rocks, additionalRocks));
    }


    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

        return maxbags(capacity, rocks, additionalRocks, rocks.length);
    }

    public static int maxbags(int[] capacity, int[] rocks, int additionalRocks, int n) {
        if(n == 0)
            return 0;
        System.out.println(Arrays.toString(capacity));
        System.out.println(Arrays.toString(rocks));

        if((capacity[n-1] > rocks[n-1]) && additionalRocks > 0){
            rocks[n-1]++;
            return Math.max(maxbags(capacity, rocks, additionalRocks -1, n), maxbags(capacity, rocks, additionalRocks, n-1));

        } else {
            return 1 + maxbags(capacity, rocks, additionalRocks, n-1);

        }


    }
}
