package structural.decorator.simplefactory_strategy_decorator.impl;

import structural.decorator.simplefactory_strategy_decorator.CashSuperDecorator;

/**
 * 消费返现类
 *
 * @author nisang
 * 2024/2/1 11:08
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashReturn extends CashSuperDecorator {
    /**
     * 返利条件
     */
    private double moneyCondition = 0d;
    /**
     * 返利值
     */
    private double moneyReturn = 0d;

    /**
     * 返利条件：消费200 减20块钱
     *
     * @param moneyCondition 消费金额条件
     * @param moneyReturn    返现值
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (moneyCondition > 0 && result > moneyCondition) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return super.acceptCash(result,1);
    }
}
