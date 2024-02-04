package creational.factory.factorymethod.factory;

import contants.Constant;
import creational.factory.factorymethod.IFactory;
import creational.factory.factorymethod.Operation;
import creational.factory.factorymethod.factory.*;

/**
 * 工厂基类
 * @author nisang
 * 2024/2/4 15:15
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class OperationFactory {

    public static Operation createOperate(String operationType) {
        IFactory factory;
        switch (operationType) {
            case Constant.ADD:
            case Constant.SUBTRACT:
            case Constant.MULTIPLY:
            case Constant.DIVIDE:
                factory = new BasicFactory(operationType);
                break;
            case Constant.POW:
            case Constant.LOG:
                factory=new AdvancedFactory(operationType);
                break;
            default:
                throw new RuntimeException(Constant.INVALID_PRODUCT_TYPE);
        }
        return factory.createOperation();

    }


}
