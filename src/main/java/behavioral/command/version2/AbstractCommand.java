package behavioral.command.version2;

/**
 * 抽象命令类
 * @author nisang
 * 2024/2/6 13:32
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class AbstractCommand {

    protected Barbecue receiver;


    public AbstractCommand(Barbecue receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    public abstract void executeCommand() ;
}
