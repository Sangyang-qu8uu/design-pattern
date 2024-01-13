package visitor;

/**
 * 具体访问者类 - 打印设备信息
 * @author nisang
 * 2024/1/13 20:44
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class PrintVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Printing mouse information");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Printing keyboard information");
    }
}
