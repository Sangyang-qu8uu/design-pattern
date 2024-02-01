package behavioral.visitor;

/**
 * 具体元素类 - 键盘
 * @author nisang
 * 2024/1/13 20:46
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
