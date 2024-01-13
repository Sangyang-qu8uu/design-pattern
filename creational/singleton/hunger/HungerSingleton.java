package singleton.hunger;

/**
 * 单例模式-饿汉式
 * 使用饿汉式单例模式的好处是简单，线程安全，因为实例在类加载时就创建，不会存在多线程环境下的竞争条件。
 * 但缺点是如果这个实例很大或者初始化需要耗费很多资源，可能会影响程序的启动性能。
 * @author nisang
 * 2024/1/13 10:37
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class HungerSingleton {
    /**
     * 私有静态变量，在类加载时就创建实例
     */
    private static final HungerSingleton EAGER_SINGLETON = new HungerSingleton();

    /**
     * 私有构造方法，防止外部直接实例化
     */
    private HungerSingleton() {
    }

    /**
     * 公共静态方法，获取唯一实例
     * @return EAGER_SINGLETON
     */
    public static HungerSingleton getInstance() {
        return EAGER_SINGLETON;
    }
}
