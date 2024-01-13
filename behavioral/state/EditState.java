package state;

/**
 * 具体状态类 - 编辑状态
 * @author nisang
 * 2024/1/13 20:57
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class EditState implements DocumentState {
    @Override
    public void performAction(DocumentContext context) {
        System.out.println("Document is in Edit State. Performing edit action.");
        // 具体的编辑操作
    }
}
