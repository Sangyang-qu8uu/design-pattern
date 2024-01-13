package reader_writer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author nisang
 * 2024/1/13 21:01
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class SharedResource {
    private int data = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public int readData() {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            // 执行读操作
            return data;
        } finally {
            readLock.unlock();
        }
    }

    public void writeData(int value) {
        Lock writeLock = lock.writeLock();
        writeLock.lock();
        try {
            // 执行写操作
            data = value;
        } finally {
            writeLock.unlock();
        }
    }
}
