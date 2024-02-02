package structural.decorator.factory_strategy_decorator;

/**
 * 收费抽象类
 *
 * @author nisang
 * 2024/2/1 11:02
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashSuperDecorator implements Sale {

    protected Sale component;

    public void decorate(Sale component) {
        this.component = component;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = 0d;
        if (component != null) {
            //若装饰对象存在，则执行装饰对象的算法运算
            result = component.acceptCash(price, num);
        }
        return result;
    }
}
