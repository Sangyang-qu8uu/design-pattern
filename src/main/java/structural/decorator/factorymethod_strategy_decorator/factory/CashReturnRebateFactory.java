package structural.decorator.factorymethod_strategy_decorator.factory;


import structural.decorator.factorymethod_strategy_decorator.Sale;
import structural.decorator.factorymethod_strategy_decorator.impl.CashNormal;
import structural.decorator.factorymethod_strategy_decorator.impl.CashRebate;
import structural.decorator.factorymethod_strategy_decorator.impl.CashReturn;

/**
 * 先满减再打折工厂类
 *
 * @author nisang
 * 2024/2/4 16:46
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashReturnRebateFactory implements SaleFactory {
    /**
     * 打折值
     */
    private double moneyRebate = 1d;

    /**
     * 返利条件
     */
    private double moneyCondition = 0d;
    /**
     * 返利值
     */
    private double moneyReturn = 0d;

    /**
     * 打折方法
     *
     * @param moneyRebate    打折值
     * @param moneyCondition 返利条件
     * @param moneyReturn    返利值
     */
    public CashReturnRebateFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 先满m减n，再打x折
     * @return
     */
    @Override
    public Sale createSalesModel() {
        //先满200减10，再打9折
        CashNormal cashNormal = new CashNormal();
        CashReturn cashReturn = new CashReturn(this.moneyCondition,this.moneyReturn);
        CashRebate cashRebate = new CashRebate(this.moneyRebate);

        cashReturn.decorate(cashNormal);
        cashRebate.decorate(cashReturn);
        return cashRebate;
    }
}
