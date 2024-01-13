package mediator;

/**
 * 具体同事类
 * @author nisang
 * 2024/1/13 20:41
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteUser implements User {
    private String name;
    private ChatMediator mediator;

    public ConcreteUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives message: " + message);
    }
}
