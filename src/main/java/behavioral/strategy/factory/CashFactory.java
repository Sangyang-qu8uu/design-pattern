package behavioral.strategy.factory;

/**
 * 收费工厂
 *
 * @author nisang
 * 2024/2/1 11:13
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashFactory {

    public static AbstractCashSuper createCashAccept(int cashType) {
        AbstractCashSuper cashSuper = null;
        switch (cashType) {
            case 1:
                cashSuper = new CashNormal();
                break;
            case 2:
                cashSuper = new CashRebate(0.8d);
                break;
            case 3:
                cashSuper = new CashReturn(300,20);
                break;
            default:
        }
        return cashSuper;
    }
}
