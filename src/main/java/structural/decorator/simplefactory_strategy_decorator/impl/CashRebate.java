package structural.decorator.simplefactory_strategy_decorator.impl;

import structural.decorator.simplefactory_strategy_decorator.CashSuperDecorator;

/**
 * 打折类
 * @author nisang
 * 2024/2/1 11:05
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashRebate extends CashSuperDecorator {
    private double moneyRebate=1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }


    @Override
    public double acceptCash(double price, int num) {
        double result = price * num * this.moneyRebate;
        return super.acceptCash(result,1) ;
    }
}
