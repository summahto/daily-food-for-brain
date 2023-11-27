package com.stack;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

Example 1:
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
 */
public class LargestRectangleAreaHistogram {
    public static void main(String[] args) {
        int [] heights = {2,1,5,6,2,3};
        Deque<Pair<Integer, Integer>> stack = new ArrayDeque<>();

        int maxSoFar = 0;
        int i ;
        for(i = 0; i< heights.length ; i++){

            int startIndex  = i;

            //as long as the stack is monotonically increasing keep adding to the stack
            //as long as you find an element (current) smaller than the top, keep on removing them from the stack
            //calculate the area(h[i] * (i - startIndex)) and update the startIndex of last biggest element seen in the stack into the current's pair
            while(!stack.isEmpty() && heights[i] < stack.peek().getKey()){

                Pair<Integer, Integer> prev = stack.pop();
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

        System.out.println(maxSoFar);
    }
}
