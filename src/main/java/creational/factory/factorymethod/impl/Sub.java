package creational.factory.factorymethod.impl;

import creational.factory.factorymethod.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nisang
 * 2024/2/4 15:12
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Sub implements Operation {
    private static final Logger logger = LoggerFactory.getLogger(Sub.class);
    @Override
    public double getResult(double s1, double s2) {
        logger.info("计算结果:{}",s1-s2);
        return s1 - s2;
    }
}
