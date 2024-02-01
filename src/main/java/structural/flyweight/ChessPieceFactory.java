package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * @author nisang
 * 2024/1/13 19:59
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ChessPieceFactory {
    private Map<String, ChessPiece> chessPieces;

    public ChessPieceFactory() {
        this.chessPieces = new HashMap<>();
    }

    // 获取或创建具体享元对象
    public ChessPiece getChessPiece(String color) {
        if (color.equalsIgnoreCase("Black")) {
            if (!chessPieces.containsKey("Black")) {
                chessPieces.put("Black", new BlackChessPiece());
            }
            return chessPieces.get("Black");
        } else if (color.equalsIgnoreCase("White")) {
            if (!chessPieces.containsKey("White")) {
                chessPieces.put("White", new WhiteChessPiece());
            }
            return chessPieces.get("White");
        } else {
            throw new IllegalArgumentException("Invalid color");
        }
    }
}
