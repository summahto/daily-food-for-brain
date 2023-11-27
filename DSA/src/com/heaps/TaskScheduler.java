package com.heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.
However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.
Return the least number of units of times that the CPU will take to finish all the given tasks.

Example 1:

Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation:
A -> B -> idle -> A -> B -> idle -> A -> B
There is at least 2 units of time between any two same tasks.
 */
public class TaskScheduler {
    public static void main(String[] args) {
        char [] tasks = {'A','A','A','B','B','B','C','C','C','D','D','E'};
        int n = 2;

        if(n == 0)
            System.out.println(tasks.length);

        PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> b - a);
        Map<Character, Integer> taskCountMap = new HashMap<>();

        for (int i=0; i< tasks.length; i++){

            taskCountMap.put(tasks[i], taskCountMap.getOrDefault(tasks[i], 0) +1);
        }

        // System.out.println(taskCountMap);

        for(int val : taskCountMap.values()){
            p.offer(val);
        }

        // System.out.println(p);

        int fmax = p.poll(), maxCount =1;
        while(!p.isEmpty()){
            int max = p.poll();

            if(max == fmax)
                maxCount++;
            else
                break;
        }

        /*
        You don't need to schedule the tasks
        if there are no idle slots in between and we have pending tasks which are less frequent than the fMax one,
        then these can be inserted in each cycle at the end without adding any idle time.
        Hence, max time required in this case will be equal to tasks.length.
         */
        System.out.println(Math.max((n+1)*(fmax -1) + maxCount, tasks.length));
    }
}
