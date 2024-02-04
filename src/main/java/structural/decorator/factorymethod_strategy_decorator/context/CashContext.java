package structural.decorator.factorymethod_strategy_decorator.context;

import contants.Constant;
import structural.decorator.factorymethod_strategy_decorator.Sale;
import structural.decorator.factorymethod_strategy_decorator.factory.CashRebateReturnFactory;
import structural.decorator.factorymethod_strategy_decorator.factory.CashReturnRebateFactory;
import structural.decorator.factorymethod_strategy_decorator.factory.SaleFactory;

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
        SaleFactory fs = null;
        switch (cashType) {
            case Constant.CASH_STRATEGY_NORMAL:
                fs = new CashReturnRebateFactory(1d, 0d, 0d);
                break;
            case Constant.CASH_STRATEGY_REBATE:
                fs = new CashReturnRebateFactory(0.8d,0d,0d);
                break;
            case Constant.CASH_STRATEGY_RETURN:
                fs = new CashReturnRebateFactory(1d, 200d, 20d);
                break;
            case Constant.CASH_STRATEGY_RETURN_REBATE:
                //先满200减10，再打9折
                fs = new CashReturnRebateFactory(0.9d, 200, 10);
                break;
            case Constant.CASH_STRATEGY_REBATE_RETURN:
                //先打9折，再满200减10
                fs = new CashRebateReturnFactory(0.9d, 200, 10);
                break;
            default:
                throw new RuntimeException(Constant.INVALID_PRODUCT_TYPE);
        }
        this.component=fs.createSalesModel();
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
