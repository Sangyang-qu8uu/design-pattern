package creational.prototype;

/**
 * @author nisang
 * 2024/1/13 14:55
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class PrototypeTest {
    public static void main(String[] args) {
        // 获取矩形的克隆对象
        Shape clonedRectangle = ShapeCache.getShape("rectangle");
        clonedRectangle.draw();

        // 获取圆形的克隆对象
        Shape clonedCircle = ShapeCache.getShape("circle");
        clonedCircle.draw();
    }
}
