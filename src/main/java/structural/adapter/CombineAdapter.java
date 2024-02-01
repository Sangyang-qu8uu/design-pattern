package structural.adapter;

/**
 * 1.使用组合来实现适配器。
 * @author nisang
 * 2024/1/13 19:01
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class CombineAdapter implements NewSystem{
    private OldSystem oldSystem;


    public CombineAdapter(OldSystem oldSystem) {
        this.oldSystem=oldSystem;
    }
    @Override
    public void request() {
        oldSystem.legacyRequest();
    }
}
