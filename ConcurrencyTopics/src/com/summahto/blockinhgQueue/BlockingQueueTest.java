import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {

        int maxCapacity = 10;
        ArrayBlockingQueue<String> testBlockQ = new ArrayBlockingQueue<String>(maxCapacity);
        Producer producerRunnable = new Producer(testBlockQ);
        Consumer consumerRunnable = new Consumer(testBlockQ);

        Thread producer = new Thread(producerRunnable, "producer");
        Thread consumer = new Thread(consumerRunnable, "consumer");

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
