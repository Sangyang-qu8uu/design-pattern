package behavioral.visitor;

/**
 * 元素接口
 * @author nisang
 * 2024/1/13 20:45
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface ComputerPart {
    /**
     * Accept.
     *
     * @param visitor the visitor
     */
    void accept(ComputerPartVisitor visitor);
}
