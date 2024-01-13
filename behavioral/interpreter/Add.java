package interpreter;


/**
 * @author nisang
 * 2024/1/13 20:53
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Add implements Expression {
    private Expression left;
    private Expression right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
