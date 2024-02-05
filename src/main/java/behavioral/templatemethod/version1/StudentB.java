package behavioral.templatemethod.version1;

/**
 * @author nisang
 * 2024/2/5 9:41
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class StudentB extends TestPaper{
    @Override
    public void testQuestion1() {
        super.testQuestion1();
        System.out.println("答案：d");
    }

    @Override
    public void testQuestion2() {
        super.testQuestion2();
        System.out.println("答案：b");
    }

    @Override
    public void testQuestion3() {
        super.testQuestion3();
        System.out.println("答案：a");
    }
}
