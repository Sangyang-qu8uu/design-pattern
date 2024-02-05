package behavioral.observer.version2.base;


import java.util.ArrayList;

/**
 * 抽象通知者(主题)
 *
 * @author nisang
 * 2024/2/5 10:47
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class BaseSubject {

    public String name;
    /**
     * 同事列表
     */
    private ArrayList<BaseObserver> observerArrayList = new ArrayList<>();

    private String action;

    public BaseSubject(String name) {
        this.name = name;
    }

    /**
     * 增加通知的同事对象
     *
     * @param observer 观察者
     */
    protected void attach(BaseObserver observer) {
        observerArrayList.add(observer);
    }

    /**
     * 减少通知的同事对象
     *
     * @param observer 观察者
     */
    public void detach(BaseObserver observer) {
        observerArrayList.remove(observer);
    }

    /**
     * 通知职员.
     */
    public void notifyEmployee() {
        for (BaseObserver observer : observerArrayList) {
            observer.update();
        }
    }

    /**
     * 得到状态
     *
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置状态
     *
     * @param action 状态
     */
    public void setAction(String action) {
        this.action = action;
    }

}
