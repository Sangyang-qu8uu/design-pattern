package behavioral.interpreter;


/**
 * 终结符表达式类 - 数字
 * @author nisang
 * 2024/1/13 20:53
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Number implements Expression {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }
}
