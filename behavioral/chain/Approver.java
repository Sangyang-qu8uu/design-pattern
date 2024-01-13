package chain;

/**
 * 处理者接口
 * @author nisang
 * 2024/1/13 20:28
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface Approver {
    /**
     * Process request.
     *
     * @param expense the expense
     */
    void processRequest(Expense expense);
}
