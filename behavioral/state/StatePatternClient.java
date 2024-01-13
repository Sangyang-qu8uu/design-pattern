package state;

/**
 * @author nisang
 * 2024/1/13 20:57
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class StatePatternClient {
    public static void main(String[] args) {
        DocumentContext documentContext = new DocumentContext();

        // 初始状态为编辑状态
        documentContext.performAction();

        // 切换到保存状态
        documentContext.setState(new SaveState());
        documentContext.performAction();
    }
}
