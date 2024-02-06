package behavioral.command.version1;

/**
 * 服务员类
 * @author nisang
 * 2024/2/6 13:39
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Waiter {


    private AbstractCommand command;


    /**
     * 设置订单
     * @param command
     */
    public void setOrder(AbstractCommand command){
        this.command = command;
    }

    /**
     * 执行通知
     */
    public void notifyCommand(){
        command.executeCommand();
    }
}
