package thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author nisang
 * 2024/1/13 21:04
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ThreadPoolExample {
    public static void main(String[] args) {
        // 创建固定大小的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 提交任务到线程池
        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task " + i);
            executorService.execute(task);
        }

        // 关闭线程池
        executorService.shutdown();
    }
}
