package com.hashing;


import java.util.HashMap;
import java.util.Map;

/*
You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:

0 <= i < j < nums.length
nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.
Example 1:

Input: nums = [42,11,1,97]
Output: 2
Explanation: The two pairs are:
 - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
 - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.
Example 2:

Input: nums = [13,10,35,24,76]
Output: 4

 */
public class CountNicePairs {
    public static void main(String[] args) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int [] nums = {13,10,35,24,76};

        long count = 0;


        for(int n : nums){
            int diff = n - reverse(n);
            countMap.put(diff, countMap.getOrDefault(diff, 0) + 1);
        }

        // countMap.entrySet().stream().

        for(Map.Entry<Integer, Integer> e: countMap.entrySet()){
            long numOfOcc = e.getValue();
            count += (numOfOcc * (numOfOcc -1))/2 ;
        }

        System.out.println((int)(count % (Math.pow(10, 9) + 7)));
    }

    private static int reverse(int n) {
        int rev = 0, i = 0, numOfDigits = 0;
        // int copyOfN = n;
        // while(copyOfN > 0){
        //     numOfDigits++;
        //     copyOfN = copyOfN /10;
        // }

        while(n > 0){
            rev = rev * 10 + n % 10;
            n = n/10;
        }

        return rev;

    }


}
