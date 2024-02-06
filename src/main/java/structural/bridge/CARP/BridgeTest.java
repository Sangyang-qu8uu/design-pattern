package structural.bridge.CARP;

import structural.bridge.CARP.combine.BaseHandsetBrand;
import structural.bridge.CARP.combine.HandBrandM;
import structural.bridge.CARP.combine.HandBrandN;
import structural.bridge.CARP.abstracts.HandsetAddressList;
import structural.bridge.CARP.abstracts.HandsetGame;

/**
 * 桥接模式测试
 * @author nisang
 * 2024/1/13 19:21
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class BridgeTest {
    public static void main(String[] args) {
        // 创建具体实现类的实例
        BaseHandsetBrand ab;

        ab=new HandBrandM();
        // 创建扩展抽象类的实例，分别使用不同的实现类
        ab.setAbstractHandsetSoft(new HandsetGame());
        // 调用抽象部分的方法，实际调用的是具体实现类的方法
        ab.run();

        ab=new HandBrandN();
        // 创建扩展抽象类的实例，分别使用不同的实现类
        ab.setAbstractHandsetSoft(new HandsetAddressList());
        // 调用抽象部分的方法，实际调用的是具体实现类的方法
        ab.run();
    }
}
