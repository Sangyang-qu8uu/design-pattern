package behavioral.strategy.factory;

/**
 * 收费抽象类
 * @author nisang
 * 2024/2/1 11:02
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class AbstractCashSuper {

    /**
     * 收取费用的抽象方法
     *
     * @param price 价格
     * @param num   数量
     * @return the double
     */
    public abstract double accept(double price,int num);
}
