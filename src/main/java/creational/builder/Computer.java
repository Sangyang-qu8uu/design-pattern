package creational.builder;

/**
 * 产品类：电脑
 *
 * @author nisang
 * 2024/1/13 14:16
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Computer {
    /**
     * cpu
     */
    private String cpu;
    /**
     * 内存
     */
    private String ram;
    /**
     * 存储
     */
    private String storage;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
