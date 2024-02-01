package behavioral.interpreter;

/**
 * @author nisang
 * 2024/1/13 20:54
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class InterpreterPatternClient {
    public static void main(String[] args) {
        // 构建语法树：5 + 3 - 2
        Expression expression = new Subtract(new Add(new Number(5), new Number(3)), new Number(2));

        // 创建上下文
        Context context = new Context("No relevance for context in this example.");

        // 解释并输出结果
        int result = expression.interpret(context);
        System.out.println("Result: " + result);
    }
}
