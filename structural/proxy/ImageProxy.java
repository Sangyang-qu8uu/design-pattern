package proxy;

/**
 * 代理类
 * @author nisang
 * 2024/1/13 20:03
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ImageProxy implements Image {
    private RealImage realImage;
    private String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
