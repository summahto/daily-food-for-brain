package com.summahto.volatility;

public class NoVisibility {
    private static boolean test;
    private static int i;

    static class ReaderRunnable implements Runnable{

        public void run(){
            System.out.println("at the start of method " + i);
            int j= 1;
            System.out.println("inside Thread :" + Thread.currentThread().getName());
            while(!test){
                Thread.yield();
                System.out.println("inside while loop " + i);
                System.out.println("yielded " + j  + " time");
            }

            System.out.println("at the end of method " + i);
        }
    }

    public static void main(String[] args) {
        Runnable readerRunnable = new ReaderRunnable();
        Thread reader = new Thread(readerRunnable, "reader");
        reader.start();
        System.out.println("Inside " + Thread.currentThread().getName());
        i = 42;
        test = true;
    }
}
