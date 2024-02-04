package creational.factory.factorymethod;

/**
 * @author nisang
 * 2024/2/4 15:08
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface IFactory {

    /**
     * 计算器运算类
     *
     * @return the operation
     */
    public Operation createOperation();
}
