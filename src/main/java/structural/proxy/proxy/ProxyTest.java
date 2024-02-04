package structural.proxy.proxy;

import structural.proxy.orign.SchoolGirl;

/**
 * 远程代理，也就是为一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实
 * 虚拟代理，是根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象
 * 安全代理，用来控制真实对象访问时的权限
 * 智能指引，是指当调用真实的对象时，代理处理另外一些事
 * @author nisang
 * 2024/2/3 16:29
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("李娇娇");

        Proxy proxy = new Proxy(girl);
        proxy.giveFlowers();
        proxy.giveDolls();
        proxy.giveChocolate();
    }
}
