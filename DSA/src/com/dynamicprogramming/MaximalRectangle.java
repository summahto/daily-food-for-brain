package com.dynamicprogramming;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;
/*
Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
Example 1:
Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.

 */

public class MaximalRectangle {

    public static void main(String[] args) {

        char [] [] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        if(matrix.length == 0)
            System.out.println(0);

        int [] heights = new int [matrix[0].length];

        // for(int j =0; j< matrix[0].length ; j++)
        //     heights[j] = matrix[0][j] - '0';


        int maxSoFar = 0, area = 0;

        for(int i=0; i< matrix.length; i++){

            //add the previous array to heights
            for(int j =0; j< matrix[i].length; j++){
                if(matrix[i][j] == '0')
                    heights[j] = 0;
                else
                    heights[j]++;
            }

            // System.out.println(Arrays.toString(heights));

            area = largestRectangleArea(heights);
            maxSoFar = Math.max(maxSoFar, area);

        }

        System.out.println(maxSoFar);

    }



    public static int largestRectangleArea(int[] heights) {

        // Map<Integer, Integer> hMap = new HashMap<>();
        Deque<Pair<Integer, Integer>> stack = new ArrayDeque<>();

        int maxSoFar = 0;
        int i = 0;
        for(; i< heights.length ; i++){

            // Use another variable to store i or the last index removed from the stack
            int startIndex  = i;

            while(!stack.isEmpty() && heights[i] < stack.peek().getKey()){

                Pair<Integer, Integer> prev = stack.pop();
                // prevIndex = prev.getValue();
                startIndex = prev.getValue();
                int area = prev.getKey() * (i - startIndex);
                if(area > maxSoFar)
                    maxSoFar = area;
            }

            // No need of checking whether the stack is empty or not and(or)whether the current height is greater than previous one
            // because startIndex is taking care of it.
            stack.push(new Pair(heights[i], startIndex));

        }

        while(!stack.isEmpty()){
            Pair<Integer, Integer> prev = stack.pop();
            int area = prev.getKey() * (i - prev.getValue());
            if(area > maxSoFar)
                maxSoFar = area;
        }

        return maxSoFar;

    }
}
