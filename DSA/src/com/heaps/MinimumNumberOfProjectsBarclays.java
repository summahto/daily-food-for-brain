package com.heaps;

import java.util.*;

public class MinimumNumberOfProjectsBarclays {
    public static int minProjectsToZeroError(int[] errorScore, int compP, int othQ) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap
        int minProjects = 0;
        int base = 0;
        for(int score : errorScore){
            maxHeap.add(score);
        }

        while(maxHeap.peek() > base){

            int max = maxHeap.poll();
            base += othQ;
            max -= compP - othQ;
            maxHeap.add(max);
            minProjects++;

        }

        return minProjects;
    }

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int errorScoreSize = scanner.nextInt();
        int[] errorScore = new int[errorScoreSize];
        for (int i = 0; i < errorScoreSize; i++) {
            errorScore[i] = scanner.nextInt();
        }
        int compP = scanner.nextInt();
        int othQ = scanner.nextInt();
*/
        int [] errorScore = {10, 4, 8, 7, 12};
        int compP = 4, othQ = 2;

        int result = minProjectsToZeroError(errorScore, compP, othQ);
        System.out.println(result);
    }


}
