package behavioral.observer.version2.observer;

import behavioral.observer.version2.base.BaseObserver;
import behavioral.observer.version2.base.BaseSubject;

/**
 * 看电视同事类
 *
 * @author nisang
 * 2024/2/5 10:27
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class WatchTVObserver extends BaseObserver {


    public WatchTVObserver(String name, BaseSubject sub) {
        super(name, sub);
    }

    @Override
    public void update(){
        System.out.println(this.sub.name+"："+this.sub.getAction()+"! "+this.name+",请关闭电视，赶紧工作。");
    }
}
