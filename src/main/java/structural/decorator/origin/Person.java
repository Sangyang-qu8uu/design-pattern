package structural.decorator.origin;

/**
 * 人装扮
 * @author nisang
 * 2024/2/2 12:59
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void wearTShirts() {
        System.out.print("大T恤");
    }

    public void wearBigTrouser() {
        System.out.print("垮裤");
    }

    public void wearSneakers() {
        System.out.print("球鞋");
    }

    public void wearSuit() {
        System.out.print("西装");

    }

    public void wearTie() {
        System.out.print("领带");


    }

    public void wearLeatherShoes() {
        System.out.print("皮鞋");

    }

    public void show() {
        System.out.println("装扮的" + name);
    }

    public static void main(String[] args) {
        Person person = new Person("张三");
        System.out.println("第一种装扮");
        person.wearTShirts();
        person.wearBigTrouser();
        person.wearSneakers();
        person.show();
        System.out.println("第二种装扮");
        person.wearSuit();
        person.wearTie();
        person.wearLeatherShoes();
        person.show();
    }
}