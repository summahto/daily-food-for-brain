package com.summahto.custom.collections;

public class Driver {

    public static void main(String[] args) {

        CustomArrayList<Integer> customList = new CustomArrayList<>();
        customList.add(2);
        customList.add(3);
        customList.add(10);
        customList.add(6);
        customList.add(1);

        System.out.println("initial size of Custom List: " + customList.size());
        customList.display();

        customList.remove(4);

        System.out.println("\nAfter removing an element Size is :" + customList.size());
        customList.display();

        customList.set(0, 100);
        System.out.println();
        customList.display();

    }
}
