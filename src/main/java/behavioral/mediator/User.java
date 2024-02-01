package behavioral.mediator;

/**
 * 同事接口
 * The interface User.
 *
 * @author nisang  2024/1/13 20:40
 * @version 1.0  Ruoyi-Cloud-Plus开发小组
 */
public interface User {
    /**
     * Send message.
     *
     * @param message the message
     */
    void sendMessage(String message);

    /**
     * Receive message.
     *
     * @param message the message
     */
    void receiveMessage(String message);
}
