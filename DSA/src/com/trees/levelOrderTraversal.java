package com.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(9);

        Integer removed = queue.poll();
        System.out.println(removed);
        Integer peekValue = queue.peek();
        System.out.println(peekValue);

        List<List<Integer>> test = new LinkedList<>();
        


    }
}
