package contants;

/**
 * 常量constant
 * @author nisang
 * 2024/1/28 15:04
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Constant {
    /**
     * 加
     */
    public static final String ADD = "+";
    /**
     * 减
     */
    public static final String SUBTRACT = "-";
    /**
     * 乘
     */
    public static final String MULTIPLY = "*";
    /**
     * 除
     */
    public static final String DIVIDE = "%";
    /**
     * 指数
     */
    public static final String POW = "pow";
    /**
     * 对数
     */
    public static final String LOG = "log";
    /**
     * 无效指令
     */
    public static final String INVALID_PRODUCT_TYPE = "Invalid product type";
    /**
     * 产品b被创建
     */
    public static final String PRODUCT_B_CREATED = "Product B created.";

    /**
     * 产品a被创建
     */
    public static final String PRODUCT_A_CREATED = "Product A created.";
    /**
     * 策略1，原价
     */
    public static final int CASH_STRATEGY_NORMAL = 1;
    /**
     * 策略2，满足条件打折
     */
    public static final int CASH_STRATEGY_REBATE =2;
    /**
     * 策略,满减返钱
     */
    public static final int CASH_STRATEGY_RETURN = 3;

    /**
     * 策略4，满减返钱，再打折
     */
    public static final int CASH_STRATEGY_RETURN_REBATE = 4;

    /**
     * 策略5，先打折,再满减返钱，
     */
    public static final int CASH_STRATEGY_REBATE_RETURN = 5;
    /**
     * 工厂对象路径
     */
    public static final String ASSEMBLY_NAME =  "structural.decorator.factorymethod_strategy_decorator.factory.";
    /**
     * data配置文件
     */
    public static final String DATA_PROPERTIES =  "data.properties";
    /**
     * 策略值
     */
    public static final String STRATEGY =  "strategy";
}
