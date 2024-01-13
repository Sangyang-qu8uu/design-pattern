package factory.factorymethod;

import factory.simple.Product;
import factory.simple.ConcreteProductB;

/**
 * @author nisang
 * 2024/1/13 11:34
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteProductBfactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
