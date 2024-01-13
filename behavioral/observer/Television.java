package observer;

/**
 * 具体观察者类 - 电视台
 * @author nisang
 * 2024/1/13 20:36
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Television implements MyObserver {
    @Override
    public void update(String weather) {
        System.out.println("TV Station received weather update: " + weather);
    }
}
