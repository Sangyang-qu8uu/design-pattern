package reader_writer;

/**
 * @author nisang
 * 2024/1/13 21:02
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Writer implements Runnable {
    private SharedResource resource;

    public Writer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            int newData = (int) (Math.random() * 100);
            resource.writeData(newData);
            System.out.println(Thread.currentThread().getName() + " wrote: " + newData);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
