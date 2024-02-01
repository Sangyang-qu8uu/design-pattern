package behavioral.visitor;

/**
 * @author nisang
 * 2024/1/13 20:46
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
    }
}
