package structural.decorator.decorator.impl;

import structural.decorator.decorator.FineryDecorator;

/**
 * 皮鞋实际服饰类
 * @author nisang
 * 2024/2/2 13:24
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class LeatherShoes extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("皮鞋");
        super.show();
    }
}
