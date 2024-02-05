package behavioral.observer.origin;

import java.util.ArrayList;

/**
 * 前台秘书类
 * @author nisang
 * 2024/2/5 10:26
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Secretary {

    protected String name;

    public Secretary(String name) {
        this.name = name;
    }

    /**
     * 同事列表
     */
    private ArrayList<StockObserver>observerArrayList=new ArrayList<StockObserver>();

    private String action;

    /**
     * 增加通知的同事对象
     * @param observer 观察者
     */
    public void attach(StockObserver observer){
        observerArrayList.add(observer);
    }

    /**
     * 通知职员.
     */
    public void notifyEmployee(){
        for (StockObserver stockObserver : observerArrayList) {
            stockObserver.update();
        }
    }

    /**
     * 得到状态
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置状态
     * @param action 状态
     */
    public void setAction(String action) {
        this.action = action;
    }
}
