package memento;

/**
 * 备忘录类
 * @author nisang
 * 2024/1/13 20:49
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class TextEditorMemento {
    private String content;

    public TextEditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
