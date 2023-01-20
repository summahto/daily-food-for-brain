package com.array.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.array.test.MissingNumber.swap;

public class AllMissingNumbers {

    public static void main(String[] args) {

        int [] nums = {4,3,2,7,8,2,3,1};

        System.out.println("\nSolution is : " + allMissedNumbers(nums));
    }

    private static List<Integer> allMissedNumbers(int[] nums) {

        int i =0;
        List<Integer> missedNumbers = new ArrayList<>();
        while(i < nums.length){

            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }

            System.out.println(Arrays.toString(nums));
        }

        for (int j=0; j< nums.length; j++){
            if(j != nums[j] -1)
                missedNumbers.add(j+1);
        }

        return missedNumbers;
    }


}
