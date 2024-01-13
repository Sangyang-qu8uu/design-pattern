package memento;

/**
 * @author nisang
 * 2024/1/13 20:51
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class MementoPatternClient {
    public static void main(String[] args) {
        // 创建文本编辑器和管理者
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // 用户输入文本
        textEditor.setContent("Hello, World!");

        // 用户创建备忘录并保存
        caretaker.setMemento(textEditor.createMemento());

        // 用户修改文本
        textEditor.setContent("Design Patterns");

        // 用户恢复到之前的状态
        textEditor.restoreFromMemento(caretaker.getMemento());

        // 输出当前文本
        System.out.println("Current content: " + textEditor.getContent());
    }
}
