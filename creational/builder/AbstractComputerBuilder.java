package builder;

/**
 * 抽象建造者类
 * @author nisang
 * 2024/1/13 14:35
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class AbstractComputerBuilder {
    protected Computer computer = new Computer();

    /**
     * 设置cpu大小
     */
    public abstract void buildCpu();

    /**
     * 设置内存大小
     */
    public abstract void buildRam();

    /**
     * 设置存储大小
     */
    public abstract void buildStorage();

    public Computer getComputer() {
        return computer;
    }

}
