package creational.builder;


/**
 * 指导者类，负责构建最终的产品
 * @author nisang
 * 2024/1/13 14:24
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Director {

    private AbstractComputerBuilder abstractComputerBuilder;

    /**
     * 构建电脑对象的方法，使用指导者来设置各个部分
     * Sets computer builder.
     *
     * @param abstractComputerBuilder the abstract computer builder
     */
    public void setComputerBuilder(AbstractComputerBuilder abstractComputerBuilder) {

        this.abstractComputerBuilder = abstractComputerBuilder;
    }

    public Computer getComputer() {
        return abstractComputerBuilder.getComputer();
    }

    public void constructComputer() {
        abstractComputerBuilder.buildCpu();
        abstractComputerBuilder.buildRam();
        abstractComputerBuilder.buildStorage();
    }
}
