package behavioral.command.version1;

import behavioral.command.version1.impl.BakeChickenWingCommand;
import behavioral.command.version1.impl.BakeMuttonCommand;

/**
 * @author nisang
 * 2024/2/6 13:41
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CommandTest1 {
    public static void main(String[] args) {
        //开店前厨师准备
        Barbecue cook = new Barbecue();
        //羊肉串就位
        AbstractCommand bakeChickenWingCommand= new BakeChickenWingCommand(cook);
        AbstractCommand bakeMuttonCommand= new BakeMuttonCommand(cook);
        //服务员就位
        Waiter waiter = new Waiter();

        //开门营业
        waiter.setOrder(bakeChickenWingCommand);
        waiter.notifyCommand();
        waiter.setOrder(bakeMuttonCommand);
        waiter.notifyCommand();


    }
}
