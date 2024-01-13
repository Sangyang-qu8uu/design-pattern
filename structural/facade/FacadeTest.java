package facade;

/**
 * @author nisang
 * 2024/1/13 19:55
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class FacadeTest {
    public static void main(String[] args) {
        // 创建子系统
        StereoSystem stereo = new StereoSystem();
        Lights lights = new Lights();
        Projector projector = new Projector();

        // 创建外观对象
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(stereo, lights, projector);

        // 使用外观接口
        homeTheater.watchMovie();

        // 关闭影院
        homeTheater.endMovie();
    }
}
