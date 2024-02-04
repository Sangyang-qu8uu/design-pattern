package structural.decorator.simplefactory_strategy_decorator.impl;

import structural.decorator.simplefactory_strategy_decorator.Sale;

/**
 * 正常收费
 * @author nisang
 * 2024/2/1 11:04
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashNormal implements Sale {

    @Override
    public double acceptCash(double price, int num) {
        return price*num;
    }
}
