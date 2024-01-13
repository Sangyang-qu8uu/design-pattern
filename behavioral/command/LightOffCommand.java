package command;

/**
 * @author nisang
 * 2024/1/13 20:25
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
