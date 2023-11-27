package com.slidingwindow;
/*
The frequency of an element is the number of times it occurs in an array.
You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.
Return the maximum possible frequency of an element after performing at most k operations.

Example 1:

Input: nums = [1,2,4], k = 5
Output: 3
Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
4 has a frequency of 3.
Example 2:

Input: nums = [1,4,8,13], k = 5
Output: 2
Explanation: There are multiple optimal solutions:
- Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
- Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
- Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.


 */

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {
    public static void main(String[] args) {
        int [] nums = {1, 4, 8, 13};
        int k = 5, maxf = 0;

        Arrays.sort(nums);
        int l = 0, r =0 ;
        long total = 0 ;

        while(r < nums.length){

            total += nums[r];
            // this is the main condition you need to think of..
            // since the array is sorted rightmost num of windows will the max.

            if(nums[r]* (r-l +1) <= total + k) {

                maxf = Math.max(maxf, (r - l + 1));
                // System.out.println(l + " :" + r + ": " + (r -l +1));

            } else {
                total -= nums[l];
                l++;
            }
            r++;

        }

        System.out.println(maxf);
    }
}
