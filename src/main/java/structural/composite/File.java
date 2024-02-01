package structural.composite;

/**
 * @author nisang
 * 2024/1/13 19:45
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}
