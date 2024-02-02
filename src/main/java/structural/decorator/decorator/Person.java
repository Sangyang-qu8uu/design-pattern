package structural.decorator.decorator;

/**
 * 具体人类
 *
 * @author nisang
 * 2024/2/2 13:12
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Person implements CharacterComponent {


    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }
}
