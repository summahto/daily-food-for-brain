package com.hashing;

import java.util.*;

/*
Given a 2D integer array nums, return all elements of nums in diagonal order as shown in the below images.

Example 1:
Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,4,2,7,5,3,8,6,9]
Example 2:

Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]
Output: [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]
 */
public class DiagonalTraverse_II {

    public static void main(String[] args) {

        List<List<Integer>> nums= new ArrayList<>();
        nums.add(List.of(1,2,3,4,5));
        nums.add(List.of(6,7));
        nums.add(List.of(8));
        nums.add(List.of(9, 10, 11));
        nums.add(List.of(12, 13, 14, 15, 16));

        int c = 0;
        Map<Integer, List<Integer>> rowMap = new HashMap<>();

        //parsing bottom-up because we need to fetch the elements in cross diagonally but in upwards direction - check notes
        for(int i= nums.size() -1; i >= 0 ; i-- ){

            for(int j = 0 ; j< nums.get(i).size(); j++){
                rowMap.computeIfAbsent(i+j, (key) -> new ArrayList<>()).add(nums.get(i).get(j));
                c++;

            }
        }
        // System.out.println(rowMap);

        int res [] = new int[c];
        int idx = 0;
        int curr = 0;
        while(rowMap.containsKey(curr)){
            for(int num : rowMap.get(curr)){
                res[idx++] = num;
            }
            curr++;
        }

        System.out.println(Arrays.toString(res));
    }
}
