package structural.facade;

/**
 * 外观类 - 家庭影院外观
 * @author nisang
 * 2024/1/13 19:55
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class HomeTheaterFacade {
    private StereoSystem stereo;
    private Lights lights;
    private Projector projector;

    public HomeTheaterFacade(StereoSystem stereo, Lights lights, Projector projector) {
        this.stereo = stereo;
        this.lights = lights;
        this.projector = projector;
    }

    // 提供简化的接口供客户端使用
    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        stereo.turnOn();
        lights.dim();
        projector.turnOn();
    }

    // 提供关闭影院的接口
    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        stereo.turnOff();
        lights.brighten();
        projector.turnOff();
    }
}
