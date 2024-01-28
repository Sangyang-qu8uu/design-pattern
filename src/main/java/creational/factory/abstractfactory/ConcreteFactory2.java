package creational.factory.abstractfactory;

/**
 *  具体工厂2，实现了抽象工厂接口，负责创建具体产品A2和B2
 * @author nisang
 * 2024/1/13 11:41
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
