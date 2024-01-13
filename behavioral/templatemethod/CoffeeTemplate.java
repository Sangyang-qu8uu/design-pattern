package templatemethod;

/**
 * 模板方法类 - 制作咖啡
 * @author nisang
 * 2024/1/13 20:16
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class CoffeeTemplate {
    // 模板方法，定义了咖啡的制作流程
    public final void makeCoffee() {
        boilWater();
        brewCoffeeGrounds();
        pourInCup();
        addCondiments();
    }

    // 具体方法 - 烧水
    private void boilWater() {
        System.out.println("Boiling water");
    }

    // 具体方法 - 冲泡咖啡
    private void brewCoffeeGrounds() {
        System.out.println("Brewing coffee grounds");
    }

    // 具体方法 - 倒入杯中
    private void pourInCup() {
        System.out.println("Pouring coffee into cup");
    }

    // 抽象方法 - 加入调料，由子类实现
    protected abstract void addCondiments();
}
