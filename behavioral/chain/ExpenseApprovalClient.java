package chain;

/**
 * @author nisang
 * 2024/1/13 20:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ExpenseApprovalClient {
    public static void main(String[] args) {
        // 创建处理者对象
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();
        DepartmentHead departmentHead = new DepartmentHead();

        // 设置责任链
        supervisor.setNextApprover(manager);
        manager.setNextApprover(departmentHead);

        // 创建报销请求
        Expense expense1 = new Expense(800);
        Expense expense2 = new Expense(3500);
        Expense expense3 = new Expense(12000);

        // 发送请求
        supervisor.processRequest(expense1);
        System.out.println();

        supervisor.processRequest(expense2);
        System.out.println();

        supervisor.processRequest(expense3);
    }
}
