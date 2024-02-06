package structural.bridge.CARP.combine;

/**
 * 手机品牌M
 * @author nisang
 * 2024/2/6 11:04
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class HandBrandM extends BaseHandsetBrand {
    @Override
    public void run() {
        System.out.println("品牌M");
        abstractHandsetSoft.run();
    }
}
