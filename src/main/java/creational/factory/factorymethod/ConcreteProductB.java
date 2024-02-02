package creational.factory.factorymethod;

import contants.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nisang
 * 2024/1/13 11:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteProductB implements Product {
    private static final Logger logger = LoggerFactory.getLogger(ConcreteProductB.class);
    @Override
    public void create() {
        logger.info(Constant.PRODUCT_B_CREATED);
    }
}