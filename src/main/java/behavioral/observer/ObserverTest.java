package behavioral.observer;

/**
 * @author nisang
 * 2024/1/13 20:37
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ObserverTest {
    public static void main(String[] args) {
        // 创建气象站主题
        WeatherStation weatherStation = new WeatherStation();

        // 创建观察者
        MyObserver mobileApp = new MobileApp();
        MyObserver tvStation = new Television();

        // 观察者订阅主题
        weatherStation.addObserver(mobileApp);
        weatherStation.addObserver(tvStation);

        // 模拟气象站更新天气信息
        weatherStation.setWeather("Sunny");

        // 观察者取消订阅主题
        weatherStation.removeObserver(tvStation);

        // 再次更新天气信息
        weatherStation.setWeather("Rainy");
    }
}
