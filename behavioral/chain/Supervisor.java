package chain;

/**
 * 具体处理者类 - 主管
 * @author nisang
 * 2024/1/13 20:28
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Supervisor implements Approver {
    private static final double MAX_APPROVAL_AMOUNT = 1000;

    private Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(Expense expense) {
        if (expense.getAmount() <= MAX_APPROVAL_AMOUNT) {
            System.out.println("Supervisor approves the expense.");
        } else if (nextApprover != null) {
            nextApprover.processRequest(expense);
        } else {
            System.out.println("Expense cannot be approved.");
        }
    }
}
