package bridge;

/**
 * 扩展抽象类
 * @author nisang
 * 2024/1/13 19:19
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class RefinedAbstraction extends Abstraction{
    /**
     * 构造方法接受实现部分的引用
     * @param implementor
     */
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 实现抽象方法，调用实现部分的方法
     */
    @Override
    public void operation() {
        System.out.println("Refined Abstraction Operation");
        implementor.operationImpl();
    }
}
