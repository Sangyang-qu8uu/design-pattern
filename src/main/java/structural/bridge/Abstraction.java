package structural.bridge;

/**
 * 抽象部分的类
 * @author nisang
 * 2024/1/13 19:18
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class Abstraction {

    protected Implementor implementor;

    /**
     * 构造方法接受实现部分的引用
     * @param implementor
     */
    public Abstraction( Implementor implementor){
        this.implementor=implementor;
    }

    /**
     * Operation.抽象方法
     */
    public abstract void operation();
}
