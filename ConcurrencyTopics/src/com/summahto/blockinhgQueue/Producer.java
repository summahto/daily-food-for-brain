package com.summahto.blockinhgQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(10);

    public Producer(ArrayBlockingQueue<String> ArrBlockQueue) {
        this.blockingQueue = ArrBlockQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            String test = new String(System.currentTimeMillis() + "");
            try {
                blockingQueue.put(test);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

