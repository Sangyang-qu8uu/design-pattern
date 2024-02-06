package behavioral.iterator;


/**
 * 迭代器模式-聚集抽象类
 *
 * @author nisang
 * 2024/2/6 9:18
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
@SuppressWarnings("rawtypes")
public abstract class AbstractAggregate {

    /**
     * 创建迭代器
     *
     * @return the iterator
     */

    public abstract ConcreteIterator createIterator();
}
