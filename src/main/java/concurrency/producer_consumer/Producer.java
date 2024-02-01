package concurrency.producer_consumer;

/**
 * @author nisang
 * 2024/1/13 20:59
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
