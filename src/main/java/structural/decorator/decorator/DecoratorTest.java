package structural.decorator.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.decorator.decorator.impl.*;

/**
 * @author nisang
 * 2024/2/2 13:27
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class DecoratorTest {
    private static final Logger logger = LoggerFactory.getLogger(DecoratorTest.class);

    public static void main(String[] args) {
        Person p = new Person("小菜");
        logger.info("第一种装扮");
        //T恤
        TShirts tShirts = new TShirts();
        //垮裤
        BigTrouser bigTrouser = new BigTrouser();
        //球鞋
        Sneakers sneakers = new Sneakers();


        tShirts.decorate(p);
        bigTrouser.decorate(tShirts);
        sneakers.decorate(bigTrouser);
        sneakers.show();

        //第二种装扮跟这个差不多
        logger.info("第二种装扮");
        //西装
        Suit suit = new Suit();
        //领带
        Tie tie = new Tie();
        //皮鞋
        LeatherShoes leatherShoes = new LeatherShoes();

        suit.decorate(p);
        tie.decorate(suit);
        leatherShoes.decorate(tie);
        leatherShoes.show();
    }
}
