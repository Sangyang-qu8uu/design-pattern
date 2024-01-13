package reader_writer;

/**
 * @author nisang
 * 2024/1/13 21:02
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Reader implements Runnable {
    private SharedResource resource;

    public Reader(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            int data = resource.readData();
            System.out.println(Thread.currentThread().getName() + " read: " + data);
        }
    }
}
