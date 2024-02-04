package structural.decorator.factorymethod_strategy_decorator.factory;


import structural.decorator.factorymethod_strategy_decorator.Sale;

/**
 * @author nisang
 * 2024/2/4 16:44
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public interface SaleFactory {


    /**
     * 商场返利工厂
     *
     * @return the sale
     */
    public Sale createSalesModel();

}
