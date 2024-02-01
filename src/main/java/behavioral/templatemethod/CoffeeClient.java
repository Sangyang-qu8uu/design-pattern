package behavioral.templatemethod;

/**
 * @author nisang
 * 2024/1/13 20:17
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CoffeeClient {
    public static void main(String[] args) {
        // 制作黑咖啡
        CoffeeTemplate blackCoffee = new BlackCoffee();
        blackCoffee.makeCoffee();

        System.out.println();

        // 制作拿铁咖啡
        CoffeeTemplate latteCoffee = new LatteCoffee();
        latteCoffee.makeCoffee();
    }
}
