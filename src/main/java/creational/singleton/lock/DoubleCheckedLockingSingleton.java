package creational.singleton.lock;

/**
 * 单例模式-双重检查锁
 * @author nisang
 * 2024/1/13 10:51
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
