package structural.decorator.decorator.impl;

import structural.decorator.decorator.FineryDecorator;

/**
 * 领带实际服饰类
 * @author nisang
 * 2024/2/2 13:23
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Tie extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("领带");
        super.show();
    }
}
