package creational.factory.simple;


import creational.contants.CreateConstant;

/**
 * 简单工厂类，负责根据计算器类型创建具体实例
 *
 * @author nisang
 * 2024/1/13 11:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class SimpleFactory {
    /**
     * 根据计算器类型创建实例
     *
     * @param type 计算器指令类型（"+","-","*","%"）
     * @return 具体执行实例
     * @throws IllegalArgumentException 如果传入无效的类型
     */
    public static Calculator createOperate(String type) {
        Calculator calculator;
        switch (type) {
            case CreateConstant.ADD:
                calculator = new CalculatorAdd();
                break;
            case CreateConstant.SUBTRACT:
                calculator = new CalculatorSubtract();
                break;
            case CreateConstant.MULTIPLY:
                calculator = new CalculatorMultiply();
                break;
            case CreateConstant.DIVIDE:
                calculator = new CalculatorDivide();
                break;
            default:
                throw new IllegalArgumentException(CreateConstant.INVALID_PRODUCT_TYPE);
        }
        return calculator;
    }
}
