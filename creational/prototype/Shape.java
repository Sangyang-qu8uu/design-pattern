package prototype;

/**
 * 原型接口
 * @author nisang
 * 2024/1/13 14:51
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface Shape extends Cloneable {
    /**
     * 画
     */
    void draw();

    /**
     * 克隆
     * @return shape
     */
    Shape clone();
}
