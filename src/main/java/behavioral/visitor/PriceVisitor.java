package behavioral.visitor;

/**
 * 具体访问者类 - 计算设备价格
 * @author nisang
 * 2024/1/13 20:45
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class PriceVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Calculating mouse price");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Calculating keyboard price");
    }
}
