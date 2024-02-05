package creational.factory.abstractfactory;

import contants.Constant;
import creational.factory.abstractfactory.context.CashContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nisang
 * 2024/2/5 14:55
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class AbstractTest {
    private static final Logger logger = LoggerFactory.getLogger(AbstractTest.class);

    public static void main(String[] args) {
        CashContext cashContext = new CashContext(Constant.CASH_STRATEGY_RETURN_REBATE);
        double result = cashContext.getResult(300, 2);
        logger.info("收银：" + result);
    }
}
