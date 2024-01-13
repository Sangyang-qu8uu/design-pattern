package observer;

/**
 * 主题接口
 * The interface Subject.
 *
 * @author nisang  2024/1/13 20:35
 * @version 1.0  Ruoyi-Cloud-Plus开发小组
 */
public interface Subject {

    /**
     * Add observer.
     *
     * @param observer the observer
     */
    void addObserver(MyObserver observer);

    /**
     * Remove observer.
     *
     * @param observer the observer
     */
    void removeObserver(MyObserver observer);

    /**
     * Notify observers.
     */
    void notifyObservers();
}
