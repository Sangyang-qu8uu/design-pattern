package decorator;

/**
 * 在这个例子中，Espresso是具体组件，而MilkDecorator和MochaDecorator是具体装饰器。
 * 客户端可以通过组合不同的装饰器来实现不同种类的咖啡，而无需修改原始咖啡类的代码。这符合装饰器模式的核心思想。
 * @author nisang
 * 2024/1/13 19:37
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CoffeeShopTest {

    public static void main(String[] args) {
        // 创建一个基础的意式咖啡
        Coffee espresso = new Espresso();
        System.out.println("Cost of Espresso: $" + espresso.cost());

        // 使用装饰器添加牛奶
        Coffee milkCoffee = new MilkDecorator(espresso);
        System.out.println("Cost of Milk Coffee: $" + milkCoffee.cost());

        // 使用装饰器同时添加牛奶和摩卡
        Coffee mochaMilkCoffee = new MochaDecorator(new MilkDecorator(espresso));
        System.out.println("Cost of Mocha Milk Coffee: $" + mochaMilkCoffee.cost());
    }
}
