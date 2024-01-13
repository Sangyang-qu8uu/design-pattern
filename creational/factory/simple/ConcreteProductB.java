package factory.simple;

/**
 * @author nisang
 * 2024/1/13 11:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteProductB implements Product {
    @Override
    public void create() {
        System.out.println("Product B created.");
    }
}
