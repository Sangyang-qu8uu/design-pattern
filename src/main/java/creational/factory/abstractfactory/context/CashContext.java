package creational.factory.abstractfactory.context;

import contants.Constant;
import structural.decorator.factorymethod_strategy_decorator.Sale;
import structural.decorator.factorymethod_strategy_decorator.factory.SaleFactory;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * 上下文获取折扣类型
 *
 * @author nisang
 * 2024/2/1 13:05
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CashContext {

    private Sale component;

    /**
     * 策略跟工厂模式结合
     *
     * @param cashType 工厂类型
     */
    public CashContext(int cashType) {
        String[] config = getConfig(cashType).split(",");
        SaleFactory fs = getInstance(config[0],Double.parseDouble(config[1]),Double.parseDouble(config[2]),Double.parseDouble(config[3]));;
        this.component = fs.createSalesModel();
    }

    /**
     * 根据收费策略不同，计算不同的结果
     *
     * @param price 价格
     * @param num   数量
     * @return 结果
     */
    public double getResult(double price, int num) {
        return this.component.acceptCash(price, num);
    }

    /**
     * 获取配置文件当中的类
     *
     * @param cashType 工厂类型
     * @return 配置文件的参数值
     */
    private String getConfig(int cashType)  {
        String result = "";
        Properties properties = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        // 使用类加载器加载配置文件
        try (InputStream input = classLoader.getResourceAsStream(Constant.DATA_PROPERTIES)) {
            // 加载配置文件
            properties.load(input);

            // 获取属性值
            result = properties.getProperty(Constant.STRATEGY + cashType);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据配置文件获取实例对象
     *
     * @param className 类名字
     * @param a         参数a
     * @param b         参数b
     * @param c         参数c
     * @return
     */
    private SaleFactory getInstance(String className, double a, double b, double c) {
        SaleFactory result = null;

        try {
            result = (SaleFactory) Class.forName(Constant.ASSEMBLY_NAME + className)
                    .getDeclaredConstructor(new Class[]{double.class, double.class, double.class})
                    .newInstance(new Object[]{a, b, c});
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;

    }
}
