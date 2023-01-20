package com.summahto.custom.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList <E>  {

    // Define INITIAL_CAPACITY, size of elements of custom ArrayList
    private static int INITIAL_CAPACITY = 2;
    private int size;

    private Object [] elementData = {}; //backing array

    public CustomArrayList(){
        this.elementData = new Object[INITIAL_CAPACITY];
    }

    public int size() {
        return size;
    }

    //Adding new elements
    public void add(E e){
        //whenever new element is added or the size of the backing array is full, call ensureCapacity
        if(size == elementData.length){
            ensureCapacity();
        }
        elementData[size++] = e;
    }

    //fetch an element at given index
    public E get(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index :" + index + " ,size: " + size );
        }
        return (E)elementData[index];
    }

    //deleting an element
    public E remove(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index :" + index + " ,size: " + size);
        }
        E removedElement = (E)elementData[index];

        //1, 3, 4
        for (int i = index ; i< size -1; i++){
            elementData[i] = elementData[i+1];
        }
        size--; //reducing the size of ArrayList after shifting the elements one cell back
        return removedElement;

    }

    //updating an element at a given index
    public void set(int index, E element){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index :" + index + " ,size: " + size);
        }
        elementData[index] = element;
    }


    public void display(){
        System.out.print("Displaying List :");
        for(int i = 0; i< size; i++){
            System.out.print(elementData[i] + " ");
        }
    }

    private void ensureCapacity() {
        System.out.println("Inside Ensure Capacity to double the size of backing array");
        int newIncreasedCapacity = elementData.length * 2; //doubling the size and creating a new Array of new size
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }

}
