package com.prefixsum;
/*
You are given an integer array nums sorted in non-decreasing order.
Build and return an integer array result with the same length as nums such that result[i] is equal to the summation of absolute differences between nums[i] and all the other elements in the array.
In other words, result[i] is equal to sum(|nums[i]-nums[j]|) where 0 <= j < nums.length and j != i (0-indexed).
Example 1:

Input: nums = [2,3,5]
Output: [4,3,5]
Explanation: Assuming the arrays are 0-indexed, then
result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.

 */

import java.util.Arrays;

public class SumOfAbsoluteDifferences {
    public static void main(String[] args) {
        int [] nums = {1,4,6,8,10};

        int n = nums.length ;
        int [] res = new int[n];
        // int [] prefix = new int [n];

        // prefix[0] = nums[0];
        int sum = 0;
        //pre-calculating the prefix-sum, finding the leftSum and rightSum using the current element and number of elements to the right and left of it
        for(int i = 0; i< n ; i++){
            // prefix[i] = prefix[i -1] + nums[i];
            sum += nums[i];
        }

        // System.out.println(Arrays.toString(prefix));
        int leftSum = 0;

        for(int i = 0; i< n ; i++) {

            // int leftSum = prefix[i] - nums[i];
            int rightSum = sum - leftSum - nums[i];

            int leftCount = i;
            int rightCount = n - i -1;

            int leftTotal = (nums[i] * leftCount) - leftSum;
            int rightTotal = rightSum - (nums[i] * rightCount) ;

            res[i] = leftTotal + rightTotal;
            leftSum += nums[i];

        }

        System.out.println(Arrays.toString(res));
    }
}
