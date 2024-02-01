package behavioral.strategy;

import behavioral.strategy.factory.AbstractCashSuper;
import behavioral.strategy.factory.CashNormal;
import behavioral.strategy.factory.CashRebate;
import behavioral.strategy.factory.CashReturn;

/**
 * 上下文获取折扣类型
 *
 * @author nisang
 * 2024/2/1 13:05
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashContext {

    private AbstractCashSuper abstractCashSuper;

    /**
     * 策略跟工厂模式结合
     *
     * @param cashType
     */
    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.abstractCashSuper = new CashNormal();
                break;
            case 2:
                this.abstractCashSuper = new CashRebate(100);
                break;
            case 3:
                this.abstractCashSuper = new CashReturn(200, 20);
                break;
            default:
        }
    }

    /**
     * 根据收费策略不同，计算不同的结果
     *
     * @param price 价格
     * @param num   数量
     * @return 结果
     */
    public double getResult(double price, int num) {
        return this.abstractCashSuper.accept(price, num);
    }
}
