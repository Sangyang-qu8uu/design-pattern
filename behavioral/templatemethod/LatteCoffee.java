package templatemethod;

/**
 * @author nisang
 * 2024/1/13 20:17
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class LatteCoffee extends CoffeeTemplate {
    @Override
    protected void addCondiments() {
        System.out.println("Adding milk foam to latte coffee");
    }
}
