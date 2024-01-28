package creational.factory.factorymethod;

/**
 * 工厂接口，定义了创建产品的方法
 * @author nisang
 * 2024/1/28 16:32
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
