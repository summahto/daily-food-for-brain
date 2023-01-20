package com.sorting.alogorithms;

//this applies only when the numbers are given from 1 to n
//and you need to sort the numbers, so each number's correct index would be it's value -1
//[5, 3, 1, 2, 4] - nums
// 0, 1, 2, 3, 4  - indices

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int [] arr = {5, 3, 1, 2, 4};
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));

        cyclicSortAlgo(arr);

        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(arr));
    }




    private static void cyclicSortAlgo(int[] arr) {

        int i = 0;
        while (i < arr.length){

            if(i != arr[i] -1){
                System.out.println("swapping numbers at indexes "+ i + " and " +  (arr[i]- 1));

                int temp = arr[i];
                System.out.println("temp = " + temp);

                arr[i] = arr[temp -1];
                System.out.println("arr [" + i + "] = " + arr[i]);

                System.out.println("arr [" + (temp -1) + "] = " + arr[temp -1]);
                arr[temp - 1]  = temp;

            } else {
                i++;
            }
//            System.out.println(Arrays.toString(arr));
        }

    }
}
