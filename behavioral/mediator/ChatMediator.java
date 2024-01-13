package mediator;

/**
 * 中介者接口
 * @author nisang
 * 2024/1/13 20:41
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface ChatMediator {
    /**
     * Send message.
     *
     * @param message the message
     * @param user    the user
     */
    void sendMessage(String message, User user);
}
