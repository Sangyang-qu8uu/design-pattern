package factory;

import factory.simple.Product;
import factory.simple.SimpleFactory;

/**
 * 简单工厂模式
 * @author nisang
 * 2024/1/13 11:42
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        // 使用简单工厂创建产品A
        Product productA = SimpleFactory.createProduct("A");
        productA.create();

        // 使用简单工厂创建产品B
        Product productB = SimpleFactory.createProduct("B");
        productB.create();
    }
}
