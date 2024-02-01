package structural.bridge;

/**具体实现类A
 * @author nisang
 * 2024/1/13 19:17
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor A Operation");
    }
}
