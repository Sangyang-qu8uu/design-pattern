package bridge;

/**
 * @author nisang
 * 2024/1/13 19:21
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class BridgeTest {
    public static void main(String[] args) {
        // 创建具体实现类的实例
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        // 创建扩展抽象类的实例，分别使用不同的实现类
        Abstraction abstractionA = new RefinedAbstraction(implementorA);
        Abstraction abstractionB = new RefinedAbstraction(implementorB);

        // 调用抽象部分的方法，实际调用的是具体实现类的方法
        abstractionA.operation();
        abstractionB.operation();
    }
}
