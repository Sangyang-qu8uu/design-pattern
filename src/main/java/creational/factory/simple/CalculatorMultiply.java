package creational.factory.simple;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体实现类-乘法
 * @author nisang
 * 2024/1/28 15:12
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */

public class CalculatorMultiply implements Calculator {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorDivide.class);
    @Override
    public void calculate(double s1, double s2) {
        logger.info("计算结果:{}",s1*s2);
    }
}
