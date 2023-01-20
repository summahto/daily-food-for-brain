package com.summahto.volatility;

public class VolatilityTest extends Thread{

    volatile boolean keepRunning = true;

    public static void main(String[] args) throws InterruptedException {
        VolatilityTest t = new VolatilityTest();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println(System.currentTimeMillis() + ": keepRunning is " + t.keepRunning +" in " + Thread.currentThread().getName());
        t.join();
        System.out.println("hashcode :" + t.hashCode());

        System.out.println("Finished T 's execution : Exiting thread " + Thread.currentThread().getName());
    }

    public void run() {
        int i =1;
        System.out.println(System.currentTimeMillis() + ": keepRunning is " + keepRunning +" in " + Thread.currentThread().getName());
        while (keepRunning){
//            System.out.println("keepRunning is " + keepRunning + " iteration  " + i++ + "in :" + Thread.currentThread().getName());
        }
        System.out.println(this.hashCode());
        System.out.println("exiting run method : " + i +  " keepRunning + "+ keepRunning);

    }
}
