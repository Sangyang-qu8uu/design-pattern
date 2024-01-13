package chain;

/**
 * 请求类
 * @author nisang
 * 2024/1/13 20:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Expense {
    private double amount;

    public Expense(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
