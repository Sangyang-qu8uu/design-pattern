package producer_consumer;

import java.util.LinkedList;

/**
 * @author nisang
 * 2024/1/13 20:59
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class SharedBuffer {
    private LinkedList<Integer> buffer;
    private int capacity;

    public SharedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            // 缓冲区满，等待消费者消费
            wait();
        }

        // 生产数据并放入缓冲区
        buffer.add(item);
        System.out.println("Produced: " + item);

        // 唤醒等待的消费者
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            // 缓冲区空，等待生产者生产
            wait();
        }

        // 消费数据并从缓冲区移除
        int item = buffer.remove();
        System.out.println("Consumed: " + item);

        // 唤醒等待的生产者
        notifyAll();

        return item;
    }
}
