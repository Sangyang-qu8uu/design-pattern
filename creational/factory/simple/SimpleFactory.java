package factory.simple;

/**
 *
 * 简单工厂类，负责根据产品类型创建具体产品实例
 * @author nisang
 * 2024/1/13 11:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class SimpleFactory {
    /**
     * 根据产品类型创建产品实例
     * @param type 产品类型（"A"或"B"）
     * @return 具体产品实例
     * @throws IllegalArgumentException 如果传入无效的产品类型
     */
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
