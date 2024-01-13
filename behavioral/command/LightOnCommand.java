package command;

/**
 * @author nisang
 * 2024/1/13 20:24
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
