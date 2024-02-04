package structural.proxy.orign;

/**
 * 追求者
 *
 * @author nisang
 * 2024/2/3 12:05
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Proxy {

    private SchoolGirl mm;

    public Proxy(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDolls() {
        System.out.println(this.mm.getName() +",你好，送你洋娃娃。");
    }

    public void giveFlowers() {
        System.out.println(this.mm.getName() +",你好，送你鲜花。");
    }

    public void giveChocolate() {
        System.out.println(this.mm.getName() +",你好，送你巧克力。");
    }

    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("李娇娇");

        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveChocolate();
        proxy.giveFlowers();

    }
}
