package creational.builder;


/**
 * @author nisang
 * 2024/1/13 14:37
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class MacComputerBuilder extends AbstractComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i7");
    }

    @Override
    public void buildRam() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }
}
