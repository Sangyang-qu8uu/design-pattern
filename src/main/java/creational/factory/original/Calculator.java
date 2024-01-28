package creational.factory.original;

import java.util.Scanner;

/**
 * 实现一个计算器的简单功能，包括2个数加减乘除的操作
 *
 * @author nisang
 * 2024/1/28 14:36
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数");
        double s1 = Double.parseDouble(sc.next());
        System.out.println("请输入第二个数");
        double s2 = Double.parseDouble(sc.next());

        System.out.println("请输入运算符");
        String s3 = sc.next();

        if (s3.equals("+")) {
            System.out.println(s1 + s2);
        } else if (s3.equals("-")) {
            System.out.println(s1 - s2);
        } else if (s3.equals("*")) {
            System.out.println(s1 * s2);
        } else if (s3.equals("%")) {
            System.out.println(s1 % s2);
        } else {
            System.out.println("输入有误");
        }
    }
}
