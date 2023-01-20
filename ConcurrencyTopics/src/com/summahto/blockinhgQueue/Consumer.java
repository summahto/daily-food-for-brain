package com.summahto.blockinhgQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);

    public Consumer(BlockingQueue ArrBlockQueue) {
        this.blockingQueue = ArrBlockQueue;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                String removedItem = blockingQueue.take();
                System.out.println("Removed Item: in " + i + "th Iteration " + removedItem);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
