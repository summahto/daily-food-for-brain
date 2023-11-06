package com.bitmanipulation;

public class XORSumEqualToZero {

    public static void main(String[] args) {

//        int [] arr = {1,2,3,0,1, 2, 3, 4, 5, 1};
        int [] arr = {4,3,2,1};
        System.out.println(XOREqualToM(arr, 0));
    }

    //non-overlapping sub-arrays
    // if i/p - {1,2,3,0,1,2,3,4,5,1}, o/p = 4
    private static int XOREqualToM(int[] arr, int m) {
        int j = 0, count = 0 ;

        int xorSum = 0;
        while(j < arr.length){

            xorSum = xorSum ^ arr[j];

            if(xorSum == m){
                count++;
                xorSum = 0;

            }
            j++;

        }
        return count;
    }
}
