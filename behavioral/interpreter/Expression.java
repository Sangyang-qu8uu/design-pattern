package interpreter;


/**
 * 抽象表达式接口
 * @author nisang
 * 2024/1/13 20:52
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface Expression {

    /**
     * Interpret int.
     *
     * @param context the context
     * @return the int
     */
    int interpret(Context context);
}
