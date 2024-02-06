package behavioral.iterator.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Java自带的遍历器
 * @author nisang
 * 2024/2/6 9:43
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> bus = new ArrayList<>();

        bus.add("大鸟");
        bus.add("小鸟");
        bus.add("行李");
        bus.add("老外");
        bus.add("公交内部员工");
        bus.add("小偷");
        Iterator<String> iterator = bus.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ,请买车票！");
        }
        System.out.println("********************************");
        ListIterator<String> stringListIterator = bus.listIterator(bus.size());
        while (stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous()+" ,请买车票！");
        }

    }
}
