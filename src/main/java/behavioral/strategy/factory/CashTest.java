package behavioral.strategy.factory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nisang
 * 2024/2/1 11:18
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashTest {
    private static final Logger logger = LoggerFactory.getLogger(CashTest.class);

    public static void main(String[] args) {
        AbstractCashSuper cashAccept = CashFactory.createCashAccept(2);
        double result = cashAccept.accept(10, 1);
        logger.info("收银："+result);
    }
}
