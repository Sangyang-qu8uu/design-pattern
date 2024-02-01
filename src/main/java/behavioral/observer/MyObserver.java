package behavioral.observer;

/**
 * 自定义观察者接口
 * @author nisang
 * 2024/1/13 20:35
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface MyObserver {
    /**
     * Update.
     *
     * @param data the data
     */
    void update(String data);
}
