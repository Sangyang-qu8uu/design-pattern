package factory.abstractfactory;

/**
 * 抽象工厂接口，定义了创建产品A和产品B的方法
 * @author nisang
 * 2024/1/13 11:40
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface AbstractFactory {

    /**
     * 创建产品A实例
     * @return 具体产品A实例
     */
    ProductA createProductA();

    /**
     * 创建产品B实例
     * @return 具体产品B实例
     */
    ProductB createProductB();
}
