package state;

/**
 *
 * 抽象状态类
 * @author nisang
 * 2024/1/13 20:56
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface DocumentState {
    /**
     * Perform action.
     *
     * @param context the context
     */
    void performAction(DocumentContext context);
}
