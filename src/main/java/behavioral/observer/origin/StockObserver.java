package behavioral.observer.origin;

/**
 * 看股票同事类
 *
 * @author nisang
 * 2024/2/5 10:27
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class StockObserver {
    private String name;

    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update(){
        System.out.println(this.sub.name+"："+this.sub.getAction()+"! "+this.name+",请关闭股票行情，赶紧工作。");
    }
}
