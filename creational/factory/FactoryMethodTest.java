package factory;

import factory.factorymethod.ConcreteProductAfactory;
import factory.factorymethod.ConcreteProductBfactory;
import factory.factorymethod.ProductFactory;
import factory.simple.Product;

/**
 * 工厂方法模式
 * @author nisang
 * 2024/1/13 11:43
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        // 使用具体工厂A创建产品A
        ProductFactory factoryA = new ConcreteProductAfactory();
        Product productA = factoryA.createProduct();
        productA.create();

        // 使用具体工厂B创建产品B
        ProductFactory factoryB = new ConcreteProductBfactory();
        Product productB = factoryB.createProduct();
        productB.create();
    }
}
