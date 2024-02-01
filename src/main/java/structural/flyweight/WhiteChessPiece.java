package structural.flyweight;

/**
 * 具体享元类 - 白色棋子
 * @author nisang
 * 2024/1/13 19:59
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class WhiteChessPiece implements ChessPiece {
    private String color;

    public WhiteChessPiece() {
        this.color = "White";
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying " + color + " chess piece at position (" + x + ", " + y + ")");
    }
}
