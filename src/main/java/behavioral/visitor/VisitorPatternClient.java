package behavioral.visitor;

/**
 * @author nisang
 * 2024/1/13 20:46
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class VisitorPatternClient {
    public static void main(String[] args) {
        Computer computer = new Computer();

        // 使用打印访问者
        ComputerPartVisitor printVisitor = new PrintVisitor();
        computer.accept(printVisitor);

        System.out.println("----------------------");

        // 使用计算价格访问者
        ComputerPartVisitor priceVisitor = new PriceVisitor();
        computer.accept(priceVisitor);
    }
}
