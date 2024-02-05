package behavioral.observer.origin;

/**
 * @author nisang
 * 2024/2/5 10:35
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class OriginTest {
    public static void main(String[] args) {
        //前台
        Secretary secretary = new Secretary("童子喆");

        //看股票的同事
        StockObserver stockObserver1 = new StockObserver("魏冠茶", secretary);
        StockObserver stockObserver2 = new StockObserver("李四", secretary);

        //前台登记2个同事
        secretary.attach(stockObserver1);
        secretary.attach(stockObserver2);

        //当发现老板回来时
        secretary.setAction("老板回来了");

        //通知
        secretary.notifyEmployee();

    }
}
