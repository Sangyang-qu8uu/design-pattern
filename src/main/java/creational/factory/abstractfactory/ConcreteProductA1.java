package creational.factory.abstractfactory;

/**
 * 具体产品A1，实现了产品A接口
 * @author nisang
 * 2024/1/13 11:38
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteProductA1 implements ProductA {
    @Override
    public void create() {
        System.out.println("Product A1 created.");
    }
}