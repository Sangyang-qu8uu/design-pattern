package builder;

/**
 * @author nisang
 * 2024/1/13 14:38
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class WindowsComputerBuilder extends AbstractComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i7");
    }

    @Override
    public void buildRam() {
        computer.setRam("32GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1T SSD");
    }
}
