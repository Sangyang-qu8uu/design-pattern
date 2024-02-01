package behavioral.command;

/**
 * 命令接口
 *
 * @author nisang  2024/1/13 20:24
 * @version 1.0  Ruoyi-Cloud-Plus开发小组
 */
public interface Command {

    /**
     * Execute.
     */
    void execute();

    /**
     * Undo.
     */
    void undo();
}
