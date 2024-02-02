package structural.decorator.decorator.impl;

import structural.decorator.decorator.FineryDecorator;

/**
 * 垮裤实际服饰类
 * @author nisang
 * 2024/2/2 13:22
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class BigTrouser extends FineryDecorator {

    @Override
    public void show() {
        System.out.print("垮裤");
        super.show();
    }
}
