package structural.decorator.decorator.impl;

import structural.decorator.decorator.FineryDecorator;

/**
 * T恤实际服饰类
 * @author nisang
 * 2024/2/2 13:20
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class TShirts extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("大T恤");
        super.show();
    }
}
