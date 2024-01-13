package strategy;

/**
 *  具体策略类 - 满减策略
 * @author nisang
 * 2024/1/13 20:19
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class AmountDiscount implements DiscountStrategy {
    private double minimumAmount;
    private double discountAmount;

    public AmountDiscount(double minimumAmount, double discountAmount) {
        this.minimumAmount = minimumAmount;
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice >= minimumAmount ? originalPrice - discountAmount : originalPrice;
    }
}
