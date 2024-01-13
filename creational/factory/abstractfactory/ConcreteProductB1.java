package factory.abstractfactory;

/**
 * 具体产品B1，实现了产品B接口
 * @author nisang
 * 2024/1/13 11:39
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteProductB1 implements ProductB {
    @Override
    public void create() {
        System.out.println("Product B1 created.");
    }
}
