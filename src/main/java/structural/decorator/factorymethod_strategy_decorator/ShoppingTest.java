package structural.decorator.factorymethod_strategy_decorator;

import behavioral.strategy.factory.CashTest;
import contants.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.decorator.factorymethod_strategy_decorator.context.CashContext;

/**
 * 使用策略+工厂+装饰者模式
 * @author nisang
 * 2024/1/13 20:20
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ShoppingTest {

    private static final Logger logger = LoggerFactory.getLogger(CashTest.class);

    public static void main(String[] args) {
        CashContext cashContext = new CashContext(Constant.CASH_STRATEGY_RETURN_REBATE);
        double result = cashContext.getResult(300, 2);
        logger.info("收银："+result);
    }
}
