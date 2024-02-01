package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者类
 * @author nisang
 * 2024/1/13 20:41
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // 排除发送消息的用户
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }

    public void addUser(User user) {
        users.add(user);
    }
}
