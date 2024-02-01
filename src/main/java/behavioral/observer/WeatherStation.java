package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题类 - 气象站
 *
 * @author nisang
 * 2024/1/13 20:35
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class WeatherStation implements Subject {
    private List<MyObserver> observers;
    private String weather;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (MyObserver observer : observers) {
            observer.update(weather);
        }
    }

    // 气象站更新天气信息的方法
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}

