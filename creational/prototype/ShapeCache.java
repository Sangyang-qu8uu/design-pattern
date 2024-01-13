package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 客户端类
 * @author nisang
 * 2024/1/13 14:54
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ShapeCache {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    // 静态块，初始化原型对象并放入缓存
    static {
        shapeMap.put("rectangle", new Rectangle());
        shapeMap.put("circle", new Circle());
    }

    /**
     * 获取原型对象的克隆
     * @param shapeType 形状
     * @return shape
     */
    static Shape getShape(String shapeType) {
        return shapeMap.get(shapeType).clone();
    }
}
