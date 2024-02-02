package behavioral.strategy.factory;

import behavioral.strategy.factory.impl.CashNormal;
import behavioral.strategy.factory.impl.CashRebate;
import behavioral.strategy.factory.impl.CashReturn;
import contants.Constant;

/**
 * 收费工厂
 *
 * @author nisang
 * 2024/2/1 11:13
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashFactory {

    public static AbstractCashSuper createCashAccept(int cashType) {
        AbstractCashSuper cashSuper = null;
        switch (cashType) {
            case Constant.CASH_STRATEGY_NORMAL:
                cashSuper = new CashNormal();
                break;
            case Constant.CASH_STRATEGY_REBATE:
                cashSuper = new CashRebate(0.8d);
                break;
            case Constant.CASH_STRATEGY_RETURN:
                cashSuper = new CashReturn(300,20);
                break;
            default:
        }
        return cashSuper;
    }
}
