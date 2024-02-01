package behavioral.mediator;

/**
 * @author nisang
 * 2024/1/13 20:42
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class MediatorPatternClient {
    public static void main(String[] args) {
        // 创建中介者
        ChatMediator mediator = new ChatMediatorImpl();

        // 创建用户
        User user1 = new ConcreteUser("User1", mediator);
        User user2 = new ConcreteUser("User2", mediator);
        User user3 = new ConcreteUser("User3", mediator);

        // 注册用户到中介者
        ((ChatMediatorImpl) mediator).addUser(user1);
        ((ChatMediatorImpl) mediator).addUser(user2);
        ((ChatMediatorImpl) mediator).addUser(user3);

        // 用户发送消息
        user1.sendMessage("Hello, everyone!");
    }
}
