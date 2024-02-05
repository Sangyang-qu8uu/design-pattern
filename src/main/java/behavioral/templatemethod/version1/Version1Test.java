package behavioral.templatemethod.version1;

/**
 * @author nisang
 * 2024/2/5 9:43
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class Version1Test {
    public static void main(String[] args) {
        StudentA studentA = new StudentA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        StudentA studentB = new StudentA();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
