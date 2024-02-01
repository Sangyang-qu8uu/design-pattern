package concurrency.producer_consumer;

import java.util.concurrent.*;

/**
 * 在这个例子中，SharedBuffer 表示共享的缓冲区，Producer 和 Consumer 分别表示生产者和消费者。
 * 生产者将数据放入缓冲区，而消费者从缓冲区取出数据。使用 synchronized 关键字确保线程同步，
 * wait() 和 notifyAll() 用于线程的等待和唤醒。这样，生产者和消费者可以安全地协作，避免竞争条件和数据不一致性。
 *
 * @author nisang
 * 2024/1/13 21:00
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ProducerConsumerTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(2);
        // 手动创建线程池，并设置线程名字
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                2,
                0L,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(2),
                new CustomThreadFactory("CustomThread")
        );

        // 提交生产者和消费者任务到线程池
        executor.execute(new Producer(sharedBuffer));
        executor.execute(new Consumer(sharedBuffer));

        // 关闭线程池
        executor.shutdown();
    }

    /**
     * 自定义线程工厂，设置线程名字
     */
    static class CustomThreadFactory implements ThreadFactory {
        private final String threadNamePrefix;

        public CustomThreadFactory(String threadNamePrefix) {
            this.threadNamePrefix = threadNamePrefix;
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName(threadNamePrefix + "-" + thread.getId());
            return thread;
        }
    }
}
