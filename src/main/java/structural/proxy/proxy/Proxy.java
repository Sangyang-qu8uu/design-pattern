package structural.proxy.proxy;

import structural.proxy.orign.SchoolGirl;

/**
 * 追求者
 *
 * @author nisang
 * 2024/2/3 12:05
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Proxy implements GiveGift {
    /**
     * 追求者对象
     */
    private Pursuit pursuit;

    public Proxy(SchoolGirl mm) {
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        this.pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        this.pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        this.pursuit.giveChocolate();
    }
}
