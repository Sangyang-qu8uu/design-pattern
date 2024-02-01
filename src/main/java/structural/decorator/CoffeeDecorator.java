package structural.decorator;

/**
 * 装饰器抽象类 - 配料
 * @author nisang
 * 2024/1/13 19:34
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}
