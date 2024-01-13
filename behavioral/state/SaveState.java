package state;

/**
 * 具体状态类 - 保存状态
 * @author nisang
 * 2024/1/13 20:57
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class SaveState implements DocumentState {
    @Override
    public void performAction(DocumentContext context) {
        System.out.println("Document is in Save State. Performing save action.");
        // 具体的保存操作
    }
}
