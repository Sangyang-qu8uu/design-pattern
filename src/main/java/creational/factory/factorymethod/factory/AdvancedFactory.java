package creational.factory.factorymethod.factory;

import contants.Constant;
import creational.factory.factorymethod.IFactory;
import creational.factory.factorymethod.Operation;
import creational.factory.factorymethod.impl.Log;
import creational.factory.factorymethod.impl.Pow;

/**
 * 高级工厂类
 * @author nisang
 * 2024/2/4 15:15
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class AdvancedFactory implements IFactory{

    private final String operationType;

    public AdvancedFactory(String operationType) {
        this.operationType = operationType;
    }

    @Override
    public Operation createOperation() {
        Operation operation;
        switch (operationType) {
            case Constant.POW:
                operation = new Pow();
                break;
            case Constant.SUBTRACT:
                operation = new Log();
                break;
            default:
                throw new RuntimeException(Constant.INVALID_PRODUCT_TYPE);
        }
        return operation;
    }
}
