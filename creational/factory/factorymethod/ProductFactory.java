package factory.factorymethod;

import factory.simple.Product;

/**
 * 工厂接口，定义了创建产品的方法
 * @author nisang
 * 2024/1/13 11:33
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface ProductFactory {
    /**
     * 创建产品实例
     * @return 具体产品实例
     */
    Product createProduct();
}
