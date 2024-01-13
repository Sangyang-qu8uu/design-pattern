package reader_writer;

/**
 * @author nisang
 * 2024/1/13 21:02
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ReaderWriterExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // 创建多个读者和写者线程
        Thread reader1 = new Thread(new Reader(resource), "Reader 1");
        Thread reader2 = new Thread(new Reader(resource), "Reader 2");
        Thread writer1 = new Thread(new Writer(resource), "Writer 1");
        Thread writer2 = new Thread(new Writer(resource), "Writer 2");

        // 启动线程
        reader1.start();
        reader2.start();
        writer1.start();
        writer2.start();
    }
}
