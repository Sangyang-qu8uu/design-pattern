package decorator;

/**
 * 具体装饰器 - 牛奶
 * @author nisang
 * 2024/1/13 19:35
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }
}
