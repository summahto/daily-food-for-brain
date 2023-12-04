package com.array.test;

public class MinTimeVisitingAllPoints {

    public static void main(String[] args) {
        int [] [] points = {{3,2}, {-2,2}};

        int seconds = 0;
        int [] prev = points[0];
        int i =1;

        while(i< points.length){

            int [] curr = points[i];
            while(prev[0] != curr[0] || prev[1] != curr[1]){


                if(curr[0] > prev[0] && curr[1] > prev[1]) {
                    prev[0]++;
                    prev[1]++;
                    seconds++;

                } else if ( curr[0] > prev[0] && curr[1] < prev[1]) {
                    prev[0]++;
                    prev[1]--;
                    seconds++;

                } else if(curr[0] < prev[0] && curr[1] > prev[1]){
                    prev[0]--;
                    prev[1]++;
                    seconds++;

                } else if(curr[0] < prev[0] && curr[1] < prev[1]){

                    prev[0]--;
                    prev[1]--;
                    seconds++;

                }
                else if(curr[0] > prev[0] && curr[1] == prev[1]) {
                    prev[0]++;
                    // prev[1]++;
                    seconds++;

                } else if ( curr[0] == prev[0] && curr[1] > prev[1]) {
                    // prev[0]++;
                    prev[1]++;
                    seconds++;

                } else if(curr[0] < prev[0] && curr[1] == prev[1]){
                    prev[0]--;
                    // prev[1]++;
                    seconds++;

                } else if(curr[0] == prev[0] && curr[1] < prev[1]){

                    // prev[0]--;
                    prev[1]--;
                    seconds++;

                }
                // seconds++;

            }

            // seconds++;
            prev = curr;
            i++;

        }

//        seconds++;

        // prev = curr;
        // continue;

        System.out.println(seconds);
    }
}
