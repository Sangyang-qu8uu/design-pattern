package strategy;

/**
 * @author nisang
 * 2024/1/13 20:20
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ShoppingCartTest {
    public static void main(String[] args) {
        // 创建购物车
        ShoppingCart shoppingCart = new ShoppingCart();

        // 设置打折策略
        shoppingCart.setDiscountStrategy(new PercentageDiscount(20));

        // 计算打折后的总价
        double totalPriceWithDiscount = shoppingCart.calculateTotalPrice(100);
        System.out.println("Total price with 20% discount: $" + totalPriceWithDiscount);

        // 设置满减策略
        shoppingCart.setDiscountStrategy(new AmountDiscount(50, 10));

        // 计算满减后的总价
        double totalPriceWithAmountDiscount = shoppingCart.calculateTotalPrice(60);
        System.out.println("Total price with $10 amount discount: $" + totalPriceWithAmountDiscount);
    }
}
