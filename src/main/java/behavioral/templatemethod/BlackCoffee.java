package behavioral.templatemethod;

/**
 * 具体子类 - 制作黑咖啡
 * @author nisang
 * 2024/1/13 20:16
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class BlackCoffee extends CoffeeTemplate {
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar to black coffee");
    }
}
