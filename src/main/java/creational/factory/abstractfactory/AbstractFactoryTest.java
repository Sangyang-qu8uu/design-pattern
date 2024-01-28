package creational.factory.abstractfactory;

/**
 * 抽象工厂模式 -可以任意组合不同工厂的产品
 * @author nisang
 * 2024/1/13 11:45
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 使用具体工厂1创建产品A1和B1
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.create();
        productB1.create();

        // 使用具体工厂2创建产品A2和B2
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.create();
        productB2.create();
    }
}
