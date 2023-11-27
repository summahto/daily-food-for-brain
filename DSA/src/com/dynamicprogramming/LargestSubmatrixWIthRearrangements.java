package com.dynamicprogramming;
/*
You are given a binary matrix of size m x n, and you are allowed to rearrange the columns of the matrix in any order.
Return the area of the largest submatrix within matrix where every element of the submatrix is 1 after reordering the columns optimally.

Example 1:
Input: matrix = [[0,0,1],[1,1,1],[1,0,1]]
Output: 4
Explanation: You can rearrange the columns as shown above.
The largest submatrix of 1s, in bold, has an area of 4.

 */

import java.util.Arrays;

public class LargestSubmatrixWIthRearrangements {

    public static void main(String[] args) {

        int [] [] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int maxSoFar = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int [] heights = matrix[0];

        for(int i= 0; i< m; i++){
            if(i > 0){

                for(int j = 0; j< n; j++){

                    if(matrix[i][j] == 1)
                        heights[j] += matrix[i][j];
                    else
                        heights[j] = 0;

                }
            }
            // create a copy and then sort it, otherwise the heights array will change and cause issues in the 2nd iteration
            int clone [] = heights.clone();
            Arrays.sort(clone);
            System.out.println(Arrays.toString(heights));
            System.out.println(Arrays.toString(clone));

            for (int k = n -1; k >= 0; k--) {
                maxSoFar = Math.max(maxSoFar, clone[k] * (n - k));
            }
        }

        System.out.println(maxSoFar);
    }
}
