package com.array.test;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        int maxSize = 5; // Set the maximum size

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the set
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(7);

        // Check if the set exceeds the maximum size
        while (linkedHashSet.size() > maxSize) {
            // Iterate over the set and remove the first element
            Iterator<Integer> iterator = linkedHashSet.iterator();
            if (iterator.hasNext()) {
                Integer oldestElement = iterator.next();
                iterator.remove();
                System.out.println("Removed oldest element: " + oldestElement);
            }
        }

        // Print the updated set
        System.out.println("Updated set: " + linkedHashSet);
    }


}

class Pair {
    char key;
    int value;

    public Pair(char key, int value) {
        this.key = key;
        this.value = value;
    }


}
