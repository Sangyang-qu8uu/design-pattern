package visitor;

/**
 * 具体元素类 - 鼠标
 * @author nisang
 * 2024/1/13 20:45
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
