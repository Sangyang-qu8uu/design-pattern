package structural.proxy;

/**
 * 具体图像类
 * @author nisang
 * 2024/1/13 20:03
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
