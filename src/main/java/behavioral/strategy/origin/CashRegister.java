package behavioral.strategy.origin;


import java.util.Scanner;

/**
 * 收银-如果使用if else肯定能实现多种折扣，但是也太不方便了
 * @author nisang
 * 2024/2/1 9:10
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */

public class CashRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入折扣");
        //折扣
        double discount=Double.parseDouble(sc.next())/10;
        //数量
        System.out.println("请输入数量");
        int sum=Integer.parseInt(sc.next());
        //单价
        System.out.println("请输入单价");
        double price=Integer.parseInt(sc.next());
        //计算总价
        double v = (sum * price) * discount;
        System.out.println("总消费为："+v);
    }
}
