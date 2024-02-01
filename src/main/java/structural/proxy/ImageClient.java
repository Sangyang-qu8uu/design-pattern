package structural.proxy;

/**
 * @author nisang
 * 2024/1/13 20:04
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class ImageClient {
    public static void main(String[] args) {
        // 使用代理对象显示图像
        Image imageProxy = new ImageProxy("example.jpg");
        imageProxy.display();

        // 图像已加载，再次使用代理对象显示图像
        imageProxy.display();
    }
}
