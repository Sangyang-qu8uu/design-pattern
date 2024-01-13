package builder;

/**
 * @author nisang
 * 2024/1/13 14:25
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();

        // 构建 Mac 电脑
        MacComputerBuilder macBuilder = new MacComputerBuilder();
        director.setComputerBuilder(macBuilder);
        director.constructComputer();
        Computer mac = director.getComputer();
        System.out.println("Mac电脑配置：" + mac);

        // 构建 Windows 电脑
        WindowsComputerBuilder windowsBuilder = new WindowsComputerBuilder();
        director.setComputerBuilder(windowsBuilder);
        director.constructComputer();
        Computer windows = director.getComputer();
        System.out.println("Windows电脑配置：" + windows);
    }
}
