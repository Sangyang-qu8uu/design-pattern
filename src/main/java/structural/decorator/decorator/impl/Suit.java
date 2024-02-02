package structural.decorator.decorator.impl;

import structural.decorator.decorator.FineryDecorator;

/**
 * 西装实际服饰类
 * @author nisang
 * 2024/2/2 13:23
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Suit extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("西装");
        super.show();
    }
}
