package creational.factory.factorymethod;

/**
 * @author nisang
 * 2024/2/4 15:10
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface Operation {


    /**
     * 获取结果
     *
     * @param s1 第一个数
     * @param s2 第二个数
     * @return 返回结果
     */
    public double getResult(double s1, double s2);
}
