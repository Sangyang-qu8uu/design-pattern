package thread_pool;

/**
 * @author nisang
 * 2024/1/13 21:04
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + name + " is executing in thread " + Thread.currentThread().getName());
        // 执行任务的具体逻辑
    }
}
