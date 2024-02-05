package behavioral.observer.version1;

/**
 * @author nisang
 * 2024/2/5 10:41
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class Observer {
    protected String name;
    protected Secretary sub;

    public Observer(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    /**
     * 通知
     */
    public abstract void  update();
}
