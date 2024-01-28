package creational.singleton.lazy;

/**
 * 单例模式-懒汉式(线程不安全)
 * @author nisang
 * 2024/1/13 10:20
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class LazySingleton {
    /**
     * 私有静态变量，用于存储唯一实例
     */
    private static LazySingleton lazySingleton;

    /**
     * 私有构造方法，防止外部直接实例化
     */
    private LazySingleton() {
    }

    /**
     * 公共静态方法，获取唯一实例
     * @return lazySingleton
     */
    @SuppressWarnings("InstantiationOfUtilityClass")
    public static LazySingleton getLazySingleton() {
        // 懒加载：在第一次使用时才创建实例
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
