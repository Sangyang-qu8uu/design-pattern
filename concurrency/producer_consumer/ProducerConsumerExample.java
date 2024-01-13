package producer_consumer;

/**
 * 在这个例子中，SharedBuffer 表示共享的缓冲区，Producer 和 Consumer 分别表示生产者和消费者。
 * 生产者将数据放入缓冲区，而消费者从缓冲区取出数据。使用 synchronized 关键字确保线程同步，
 * wait() 和 notifyAll() 用于线程的等待和唤醒。这样，生产者和消费者可以安全地协作，避免竞争条件和数据不一致性。
 * @author nisang
 * 2024/1/13 21:00
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(2);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
