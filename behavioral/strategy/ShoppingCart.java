package strategy;

/**
 * 上下文类 - 购物车
 * @author nisang
 * 2024/1/13 20:19
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotalPrice(double originalPrice) {
        if (discountStrategy != null) {
            return discountStrategy.applyDiscount(originalPrice);
        }
        return originalPrice;
    }
}
