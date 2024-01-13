package adapter;

/**
 * 1.使用继承来实现适配器。
 * @author nisang
 * 2024/1/13 19:01
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Adapter extends OldSystem implements NewSystem{
    @Override
    public void request() {
        legacyRequest();
    }
}
