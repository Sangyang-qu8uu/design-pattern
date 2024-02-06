package behavioral.iterator;

/**
 * 具体迭代器
 * @author nisang
 * 2024/2/6 9:36
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteIterator extends AbstractIterator {

    private ConcreteAggregate concreteAggregate;
    private int current = 0;

    /**
     * 初始化的时候将具体聚集对象传入
     *
     * @param concreteAggregate 聚集对象
     */
    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    /**
     * 得到第一个对象
     *
     * @return 对像
     */
    @Override
    public Object first() {
        return concreteAggregate.getCurrentItem(0);
    }

    /**
     * 得到下一个对象
     *
     * @return 对象
     */
    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < concreteAggregate.getCount()) {
            ret = concreteAggregate.getCurrentItem(current);
        }
        return ret;
    }

    /**
     * 判断当前是否遍历到结尾，结尾则为true
     *
     * @return result
     */
    @Override
    public boolean isDone() {
        return current >= concreteAggregate.getCount();
    }

    /**
     * 返回当前聚焦对象
     *
     * @return 当前对象
     */
    @Override
    public Object currentItem() {
        return concreteAggregate.getCurrentItem(current);
    }
}
