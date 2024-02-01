package behavioral.strategy.factory;

/**
 * 消费返现类
 *
 * @author nisang
 * 2024/2/1 11:08
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashReturn extends AbstractCashSuper {
    /**
     * 返利条件
     */
    private double moneyCondition = 0d;
    /**
     * 返利值
     */
    private double moneyReturn = 0d;

    /**
     * 返利条件：消费200 减20块钱
     *
     * @param moneyCondition
     * @param moneyReturn
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double accept(double price, int num) {
        double result = price * num;
        if (moneyCondition > 0 && result > moneyCondition) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
