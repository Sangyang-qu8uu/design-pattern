package creational.factory.factorymethod;

import creational.contants.CreateConstant;
import creational.factory.simple.CalculatorAdd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nisang
 * 2024/1/13 11:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteProductA implements Product {
    private static final Logger logger = LoggerFactory.getLogger(ConcreteProductA.class);
    @Override
    public void create() {
        logger.info(CreateConstant.PRODUCT_A_CREATED);
    }
}