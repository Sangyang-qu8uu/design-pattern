package structural.composite;

/**
 * @author nisang
 * 2024/1/13 19:46
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class FileSystemTest {
    public static void main(String[] args) {
        // 创建文件
        FileSystemComponent file1 = new File("File 1");
        FileSystemComponent file2 = new File("File 2");

        // 创建文件夹，并添加文件和其他文件夹
        Folder folder1 = new Folder("Folder 1");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        // 创建另一个文件夹
        Folder folder2 = new Folder("Folder 2");

        // 添加第一个文件夹和文件到第二个文件夹
        folder2.addComponent(folder1);
        folder2.addComponent(new File("File 3"));

        // 显示文件系统
        folder2.display();
    }
}
