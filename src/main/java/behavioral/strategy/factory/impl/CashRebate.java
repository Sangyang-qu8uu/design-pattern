package behavioral.strategy.factory.impl;

import behavioral.strategy.factory.AbstractCashSuper;

/**
 * 打折类
 * @author nisang
 * 2024/2/1 11:05
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashRebate extends AbstractCashSuper {
    private double moneyRebate=1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double accept(double price, int num) {
        return price*num*this.moneyRebate;
    }


}
