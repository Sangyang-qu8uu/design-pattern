package behavioral.memento;

/**
 * 发起人类
 * @author nisang
 * 2024/1/13 20:50
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class TextEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // 创建备忘录
    public TextEditorMemento createMemento() {
        return new TextEditorMemento(content);
    }

    // 恢复状态
    public void restoreFromMemento(TextEditorMemento memento) {
        this.content = memento.getContent();
    }
}
