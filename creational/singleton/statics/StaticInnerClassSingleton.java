package singleton.statics;

/**单例模式-静态内部类
 * @author nisang
 * 2024/1/13 10:52
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class StaticInnerClassSingleton {

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
