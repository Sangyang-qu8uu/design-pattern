package strategy;

/**
 * 具体策略类 - 打折策略
 * @author nisang
 * 2024/1/13 20:18
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class PercentageDiscount implements DiscountStrategy {
    private double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * (1 - discountPercentage / 100);
    }
}
