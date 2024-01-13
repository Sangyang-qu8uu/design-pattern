package strategy;

/**
 * 策略接口
 * @author nisang
 * 2024/1/13 20:18
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface DiscountStrategy {
    /**
     * Apply discount double.
     *
     * @param originalPrice the original price
     * @return the double
     */
    double applyDiscount(double originalPrice);
}
