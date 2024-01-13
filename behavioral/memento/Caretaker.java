package memento;

/**
 *  管理者类
 * @author nisang
 * 2024/1/13 20:50
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Caretaker {
    private TextEditorMemento memento;

    public TextEditorMemento getMemento() {
        return memento;
    }

    public void setMemento(TextEditorMemento memento) {
        this.memento = memento;
    }
}
