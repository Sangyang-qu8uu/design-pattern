package factory.abstractfactory;

/**
 * 具体工厂1，实现了抽象工厂接口，负责创建具体产品A1和B1
 * @author nisang
 * 2024/1/13 11:40
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
