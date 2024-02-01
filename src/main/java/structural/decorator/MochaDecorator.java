package structural.decorator;

/**
 * 具体装饰器 - 摩卡
 * @author nisang
 * 2024/1/13 19:36
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class MochaDecorator extends CoffeeDecorator{

    public MochaDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Mocha";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}
