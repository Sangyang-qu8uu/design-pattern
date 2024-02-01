package behavioral.state;

/**
 * 上下文类
 * @author nisang
 * 2024/1/13 20:56
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class DocumentContext {
    private DocumentState currentState;

    public DocumentContext() {
        // 初始状态为编辑状态
        currentState = new EditState();
    }

    public void setState(DocumentState state) {
        currentState = state;
    }

    public void performAction() {
        currentState.performAction(this);
    }
}
