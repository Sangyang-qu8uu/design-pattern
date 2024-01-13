package visitor;

/**
 * 访问者接口
 * The interface Computer part visitor.
 *
 * @author nisang  2024/1/13 20:44
 * @version 1.0  Ruoyi-Cloud-Plus开发小组
 */
public interface ComputerPartVisitor {
    /**
     * Visit.
     *
     * @param mouse the mouse
     */
    void visit(Mouse mouse);

    /**
     * Visit.
     *
     * @param keyboard the keyboard
     */
    void visit(Keyboard keyboard);
}
