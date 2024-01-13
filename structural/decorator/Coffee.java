package decorator;

/**
 * 抽象组件 - 咖啡接口
 *FileSystemComponent
 * @author nisang  2024/1/13 19:33
 * @version 1.0  Ruoyi-Cloud-Plus开发小组
 */
public interface Coffee {
    /**
     * Gets description.
     *
     * @return the description
     */
    String getDescription();

    /**
     * Cost double.
     *
     * @return the double
     */
    double cost();
}
