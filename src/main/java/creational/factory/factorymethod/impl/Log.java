package creational.factory.factorymethod.impl;

import creational.factory.factorymethod.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nisang
 * 2024/2/4 15:46
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Log implements Operation {
    private static final Logger logger = LoggerFactory.getLogger(Log.class);
    @Override
    public double getResult(double s1, double s2) {
        double result = Math.log(s2) / Math.log(s1);
        logger.info("计算结果:{}", result);
        return result;
    }
}
