package command;

/**
 * 调用者 - 遥控器
 * @author nisang
 * 2024/1/13 20:25
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndoButton() {
        command.undo();
    }
}
