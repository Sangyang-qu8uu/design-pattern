package chain;

/**
 * 具体处理者类 - 部门领导
 * @author nisang
 * 2024/1/13 20:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class DepartmentHead implements Approver {
    private static final double MAX_APPROVAL_AMOUNT = 10000;

    @Override
    public void processRequest(Expense expense) {
        if (expense.getAmount() <= MAX_APPROVAL_AMOUNT) {
            System.out.println("Department Head approves the expense.");
        } else {
            System.out.println("Expense cannot be approved.");
        }
    }
}
