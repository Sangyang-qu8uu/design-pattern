package behavioral.observer.version2.observer;


import behavioral.observer.version2.base.BaseObserver;
import behavioral.observer.version2.base.BaseSubject;

/**
 * 看股票同事类
 *
 * @author nisang
 * 2024/2/5 10:27
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class StockObserver extends BaseObserver {


    public StockObserver(String name, BaseSubject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(super.sub.name + "：" + super.sub.getAction() + "! " + super.name + ",请关闭股票行情，赶紧工作。");
    }
}
