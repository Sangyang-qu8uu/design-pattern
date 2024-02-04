package creational.factory.factorymethod;

import creational.factory.factorymethod.factory.OperationFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * 工厂方法
 * 工厂方法模式优点 :
 *
 * 不关心创建细节 : 用户 只需要 关心 所需产品 对应的工厂 , 无需关心创建细节 ;
 * 符合开闭原则 : 加入 新产品 , 符合开闭原则 , 提高可扩展性 ;
 * 工厂方法模式 中 , 使用 工厂类创建 产品对象 , 同时 隐藏了 具体的 产品类 被 实例化 的细节 ;
 *
 * 工厂方法模式缺点 :
 * 增加复杂性 : 类的个数容易过多 , 增加系统复杂度 ;
 * 在 添加新产品 时 , 除了编写 新的产品类 之外 , 还要 编写该产品类对应的 工厂类 ;
 * 增加难度 : 增加了系统 抽象性 和 理解难度 ;
 * 工厂方法本身 利用了抽象 , 该模式中会 引入抽象层 , 如果要动态创建产品类 , 还要 引入反射技术 ;
 *
 * @author nisang
 * 2024/1/28 16:04
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class FactoryMethodTest {
    private static final Logger logger = LoggerFactory.getLogger(FactoryMethodTest.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        logger.info("请输入第一个数");
        double s1 = Double.parseDouble(sc.next());
        logger.info("请输入第二个数");
        double s2 = Double.parseDouble(sc.next());

        logger.info("请输入运算符");
        String s3 = sc.next();

        Operation operate = OperationFactory.createOperate(s3);
        operate.getResult(s1,s2);
    }
}
