package com.test;

public class Counter {

    int count;
    String name;

    public Counter(){
        this("Counter one");
    }

    public Counter(String name){
        this(0, name);
    }
    public Counter(int value, String name){
        if(value > 0){
        this.count = value;
        }
        this.name = name;
    }

    public int getValue() {
        return count;
    }

    public int increase(int count){
        return ++count;
    }

    public int decrease(int count){
        return --count;
    }
}
