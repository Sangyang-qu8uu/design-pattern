package structural.bridge.CARP.combine;

import structural.bridge.CARP.abstracts.AbstractHandsetSoft;

/**
 * 手机品牌
 *
 * @author nisang
 * 2024/2/6 11:03
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public abstract class BaseHandsetBrand {


    protected AbstractHandsetSoft abstractHandsetSoft;

    /**
     * 设置手机软件
     *
     * @param abstractHandsetSoft 手机软件
     */
    public void setAbstractHandsetSoft(AbstractHandsetSoft abstractHandsetSoft) {
        //接口可以使用无参构造方法
        this.abstractHandsetSoft = abstractHandsetSoft;
    }

    /**
     * 运行
     */
    public abstract void run();
}
