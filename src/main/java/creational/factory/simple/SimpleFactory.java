package creational.factory.simple;


import contants.Constant;

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
            case Constant.ADD:
                calculator = new CalculatorAdd();
                break;
            case Constant.SUBTRACT:
                calculator = new CalculatorSubtract();
                break;
            case Constant.MULTIPLY:
                calculator = new CalculatorMultiply();
                break;
            case Constant.DIVIDE:
                calculator = new CalculatorDivide();
                break;
            default:
                throw new IllegalArgumentException(Constant.INVALID_PRODUCT_TYPE);
        }
        return calculator;
    }
}
