package behavioral.interpreter;


/**
 * 终结符表达式类 - 减法
 * @author nisang
 * 2024/1/13 20:53
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Subtract implements Expression {
    private Expression left;
    private Expression right;

    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
