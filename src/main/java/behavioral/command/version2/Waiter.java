package behavioral.command.version2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 服务员类
 * @author nisang
 * 2024/2/6 13:39
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Waiter {


    private ArrayList<AbstractCommand> orders=new ArrayList<AbstractCommand>();


    /**
     * 设置订单
     * @param command
     */
    public void setOrder(AbstractCommand command){
        String className = command.getClass().getSimpleName();
        if (className.equals("BakeChickenWingCommand")){
            System.out.println("服务员：鸡翅没了，请点一些其他东西");
        }else {
            this.orders.add(command);
            System.out.println("增加订单："+className+"时间："+getNowTime());
        }
    }

    public void cancelOrder(AbstractCommand command){
        String className = command.getClass().getSimpleName();
        orders.remove(command);
        System.out.println("取消订单："+className+" 时间："+getNowTime());
    }

    /**
     * 执行通知
     */
    public void notifyCommand(){
        for (AbstractCommand command : orders) {
            command.executeCommand();
        }
    }

    private String getNowTime(){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        return format.format(new Date());
    }
}
