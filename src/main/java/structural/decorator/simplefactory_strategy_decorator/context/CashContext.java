package structural.decorator.simplefactory_strategy_decorator.context;

import contants.Constant;
import structural.decorator.simplefactory_strategy_decorator.Sale;
import structural.decorator.simplefactory_strategy_decorator.impl.CashNormal;
import structural.decorator.simplefactory_strategy_decorator.impl.CashRebate;
import structural.decorator.simplefactory_strategy_decorator.impl.CashReturn;

/**
 * 上下文获取折扣类型
 *
 * @author nisang
 * 2024/2/1 13:05
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashContext {

    private Sale component;

    /**
     * 策略跟工厂模式结合
     *
     * @param cashType
     */
    public CashContext(int cashType) {
        switch (cashType) {
            case Constant.CASH_STRATEGY_NORMAL:
                this.component = new CashNormal();
                break;
            case Constant.CASH_STRATEGY_REBATE:
                this.component = new CashRebate(100d);
                break;
            case Constant.CASH_STRATEGY_RETURN:
                this.component = new CashReturn(200d, 20d);
                break;
            case Constant.CASH_STRATEGY_RETURN_REBATE:
                //先满200减10，再打9折
                CashNormal cashNormal = new CashNormal();
                CashReturn cashReturn = new CashReturn(200d,10d);
                CashRebate cashRebate = new CashRebate(0.9d);

                cashReturn.decorate(cashNormal);
                cashRebate.decorate(cashReturn);
                this.component=cashRebate;
                break;
            case Constant.CASH_STRATEGY_REBATE_RETURN:
                //先打9折，再满200减10
                CashNormal normal = new CashNormal();
                CashRebate rebate = new CashRebate(0.9d);
                CashReturn aReturn = new CashReturn(200d,10d);

                rebate.decorate(normal);
                aReturn.decorate(rebate);
                this.component=aReturn;
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
        return this.component.acceptCash(price, num);
    }
}
