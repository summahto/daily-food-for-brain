package com.array.test;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int [] nums = {9,6,4,8,3,5,7,0,1};
//        System.out.println(missing(nums));

        System.out.println(missingXOR(nums));

    }

    private static int missingXOR(int[] nums) {

        int missing = nums.length;
        for(int i = 0; i< nums.length; i++){
            missing = missing ^ i ^ nums[i];
        }

        return missing;
    }

    static int missing(int [] nums){
        int i =0;
        while(i < nums.length){

            if(i != nums[i]){

                if(nums[i] < nums.length){
                    swap(nums, i, nums[i]);
                } else {
                    i++;
                }
            } else
                i++;

            System.out.println(Arrays.toString(nums));
        }

        for(int j=0 ; j< nums.length ; j++){
            if(j != nums[j])
                return j;
        }

        return nums.length;
    }

    public static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
