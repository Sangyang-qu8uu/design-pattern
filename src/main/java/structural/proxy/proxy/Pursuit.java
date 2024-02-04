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
public class Pursuit implements GiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(this.mm.getName() + ",你好，送你洋娃娃。");
    }

    @Override
    public void giveFlowers() {
        System.out.println(this.mm.getName() + ",你好，送你鲜花。");
    }

    @Override
    public void giveChocolate() {
        System.out.println(this.mm.getName() + ",你好，送你巧克力。");
    }

}
