package prototype;

/**
 * 具体原型类：圆形
 * @author nisang
 * 2024/1/13 14:54
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public Shape clone() {
        return new Circle();
    }
}
