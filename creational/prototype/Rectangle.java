package prototype;

/**
 * 具体原型类：矩形
 * @author nisang
 * 2024/1/13 14:53
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
}
