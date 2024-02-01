package behavioral.observer;

/**
 * 具体观察者类 - 手机App
 * @author nisang
 * 2024/1/13 20:36
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class MobileApp implements MyObserver {
    @Override
    public void update(String weather) {
        System.out.println("Mobile App received weather update: " + weather);
    }
}
