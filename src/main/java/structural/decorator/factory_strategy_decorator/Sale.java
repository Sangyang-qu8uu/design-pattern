package structural.decorator.factory_strategy_decorator;

/**
 * @author nisang
 * 2024/2/2 13:53
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface Sale {

    /**
     * 收取费用的抽象方法
     *
     * @param price 价格
     * @param num   数量
     * @return the double
     */
    public abstract double acceptCash(double price,int num);
}
