package behavioral.strategy.factory;

/**
 * 正常收费
 * @author nisang
 * 2024/2/1 11:04
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashNormal extends AbstractCashSuper {
    @Override
    public double accept(double price, int num) {
        return price*num;
    }
}
