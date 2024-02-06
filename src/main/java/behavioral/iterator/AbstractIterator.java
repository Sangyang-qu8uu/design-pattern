package behavioral.iterator;

/**
 * 迭代器抽象类
 *
 * @author nisang  2024/2/6 9:28
 * @version 1.0  Ruoyi-Cloud-Plus开发小组
 */
public abstract class AbstractIterator {


    /**
     * 第一个
     *
     * @return the object
     */
    public abstract Object first();

    /**
     * 下一个
     *
     * @return the object
     */
    public abstract Object next();

    /**
     * 是否到最后一个
     *
     * @return the boolean
     */
    public abstract boolean isDone();

    /**
     * 当前对象
     *
     * @return the object
     */
    public abstract Object currentItem();
}
