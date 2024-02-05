package behavioral.observer.version2;

import behavioral.observer.version2.base.BaseObserver;
import behavioral.observer.version2.base.BaseSubject;
import behavioral.observer.version2.impl.Boss;
import behavioral.observer.version2.observer.StockObserver;
import behavioral.observer.version2.observer.WatchTVObserver;

/**
 * @author nisang
 * 2024/1/13 20:37
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ObserverTest {
    public static void main(String[] args) {
        BaseSubject boss = new Boss("王老板");

        //看股票的同事
        BaseObserver stockObserver = new StockObserver("张三", boss);
        WatchTVObserver observer = new WatchTVObserver("李四", boss);
        //看电视的同事
        WatchTVObserver tvObserver = new WatchTVObserver("孙悟空", boss);
        //去除通知的人
        boss.detach(stockObserver);
        //老板回来
        boss.setAction("我回来了");
        //通知2个同事
        boss.notifyEmployee();
    }
}
