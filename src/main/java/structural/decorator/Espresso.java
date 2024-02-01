package structural.decorator;

/**
 * 具体组件 - 意式咖啡
 * @author nisang
 * 2024/1/13 19:33
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Espresso implements Coffee{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
