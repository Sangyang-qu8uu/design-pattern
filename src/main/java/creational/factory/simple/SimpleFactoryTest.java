package creational.factory.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * 简单工厂模式
 * @author nisang
 * 2024/1/13 11:42
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class SimpleFactoryTest {
    private static final Logger logger = LoggerFactory.getLogger(SimpleFactoryTest.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        logger.info("请输入第一个数");
        double s1 = Double.parseDouble(sc.next());
        logger.info("请输入第二个数");
        double s2 = Double.parseDouble(sc.next());

        logger.info("请输入运算符");
        String s3 = sc.next();

        Calculator calculator= SimpleFactory.createProduct(s3);
        calculator.calculate(s1,s2);
    }
}
