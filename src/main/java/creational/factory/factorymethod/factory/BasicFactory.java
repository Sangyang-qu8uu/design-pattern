package creational.factory.factorymethod.factory;

import contants.Constant;
import creational.factory.factorymethod.IFactory;
import creational.factory.factorymethod.Operation;
import creational.factory.factorymethod.impl.Add;
import creational.factory.factorymethod.impl.Div;
import creational.factory.factorymethod.impl.Mul;
import creational.factory.factorymethod.impl.Sub;

/**
 * 基础工厂类
 * @author nisang
 * 2024/2/4 15:15
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class BasicFactory implements IFactory{

    private final String operationType;

    public BasicFactory(String operationType) {
        this.operationType = operationType;
    }
    @Override
    public Operation createOperation() {
        Operation operation;
        switch (operationType) {
            case Constant.ADD:
                operation = new Add();
                break;
            case Constant.SUBTRACT:
                operation = new Sub();
                break;
            case Constant.MULTIPLY:
                operation = new Mul();
                break;
            case Constant.DIVIDE:
                operation = new Div();
                break;
            default:
                throw new RuntimeException(Constant.INVALID_PRODUCT_TYPE);
        }
        return operation;
    }
}
