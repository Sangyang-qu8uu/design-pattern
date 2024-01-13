package command;

/**
 * @author nisang
 * 2024/1/13 20:26
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CommandClient {
    public static void main(String[] args) {
        // 创建灯光对象
        Light light = new Light();

        // 创建命令对象
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // 创建遥控器对象
        RemoteControl remoteControl = new RemoteControl();

        // 设置命令并执行
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // 撤销操作
        remoteControl.pressUndoButton();

        // 再次设置命令并执行
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
