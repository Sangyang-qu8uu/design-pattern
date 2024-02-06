package behavioral.iterator;

import java.util.ArrayList;

/**
 * 具体聚集类
 *
 * @author nisang
 * 2024/2/6 9:21
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
@SuppressWarnings("rawtypes")
public class ConcreteAggregate extends AbstractAggregate {
    /**
     * 声明一个ArrayList存放泛型变量，用于存放聚合对象
     */
    private ArrayList<Object> items = new ArrayList<Object>();

    @Override
    public ConcreteIterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 返回聚合个数
     *
     * @return the int
     */
    public int getCount() {
        return items.size();
    }

    /**
     * 增加新对象
     *
     * @param o object
     */
    public void add(Object o) {
        items.add(o);
    }

    /**
     * 得到索引对象
     *
     * @return object
     */
    public Object getCurrentItem(int index) {
        return items.get(index);
    }
}
