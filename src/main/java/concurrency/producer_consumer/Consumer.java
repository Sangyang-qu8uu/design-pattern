package concurrency.producer_consumer;

/**
 * @author nisang
 * 2024/1/13 20:59
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                buffer.consume();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
