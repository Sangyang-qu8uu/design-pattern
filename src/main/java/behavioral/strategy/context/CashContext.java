package behavioral.strategy.context;

import behavioral.strategy.factory.AbstractCashSuper;
import behavioral.strategy.factory.impl.CashNormal;
import behavioral.strategy.factory.impl.CashRebate;
import behavioral.strategy.factory.impl.CashReturn;
import contants.Constant;

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
            case Constant.CASH_STRATEGY_NORMAL:
                this.abstractCashSuper = new CashNormal();
                break;
            case Constant.CASH_STRATEGY_REBATE:
                this.abstractCashSuper = new CashRebate(100);
                break;
            case Constant.CASH_STRATEGY_RETURN:
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
