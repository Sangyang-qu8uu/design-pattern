package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nisang
 * 2024/1/13 19:45
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
}
