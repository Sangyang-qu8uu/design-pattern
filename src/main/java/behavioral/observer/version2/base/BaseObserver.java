package behavioral.observer.version2.base;

/**
 * 观察者基类
 * @author nisang
 * 2024/2/5 10:41
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class BaseObserver {
    protected String name;
    protected BaseSubject sub;

    public BaseObserver(String name, BaseSubject sub) {
        this.name = name;
        this.sub = sub;
        registerToSubject();
    }

    /**
     * 防止重复注册
     */
    protected void registerToSubject() {
        sub.attach(this);
    }
    /**
     * 通知
     */
    public abstract void  update();
}
