package behavioral.iterator;

/**
 * @author nisang
 * 2024/2/6 9:43
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class IteratorTest {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.add("大鸟");
        aggregate.add("小鸟");
        aggregate.add("行李");
        aggregate.add("老外");
        aggregate.add("公交内部员工");
        aggregate.add("小偷");

        ConcreteIterator iterator = new ConcreteIterator(aggregate);
//        ConcreteIteratorDesc iteratorDesc = new ConcreteIteratorDesc(aggregate);
        iterator.first();

        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + ",请买车票！");
            iterator.next();
        }
    }
}
