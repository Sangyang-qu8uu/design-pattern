package structural.flyweight;

/**
 * @author nisang
 * 2024/1/13 20:00
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ChessGameTest {
    public static void main(String[] args) {
        ChessPieceFactory chessPieceFactory = new ChessPieceFactory();

        // 创建黑色棋子，并在不同位置显示
        ChessPiece blackChessPiece = chessPieceFactory.getChessPiece("Black");
        blackChessPiece.display(1, 2);

        // 创建白色棋子，并在不同位置显示
        ChessPiece whiteChessPiece = chessPieceFactory.getChessPiece("White");
        whiteChessPiece.display(3, 4);

        // 再次显示相同黑色棋子
        ChessPiece anotherBlackChessPiece = chessPieceFactory.getChessPiece("Black");
        anotherBlackChessPiece.display(5, 6);
    }
}
