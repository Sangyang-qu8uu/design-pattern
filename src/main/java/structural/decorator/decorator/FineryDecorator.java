package structural.decorator.decorator;

/**
 * 服饰装饰者类
 *
 * @author nisang
 * 2024/2/2 13:14
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class FineryDecorator implements CharacterComponent {

    protected CharacterComponent component;


    /**
     * set CharacterComponent对象
     *
     * @param component the component
     */
    public void decorate(CharacterComponent component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
