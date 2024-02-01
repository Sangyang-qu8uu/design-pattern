package behavioral.strategy;

import behavioral.strategy.factory.CashTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用策略获取上下文，以及工厂优化条件
 * @author nisang
 * 2024/1/13 20:20
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ShoppingTest {

    private static final Logger logger = LoggerFactory.getLogger(CashTest.class);

    public static void main(String[] args) {
        CashContext cashContext = new CashContext(1);
        double result = cashContext.getResult(100, 2);
        logger.info("收银："+result);
    }
}
