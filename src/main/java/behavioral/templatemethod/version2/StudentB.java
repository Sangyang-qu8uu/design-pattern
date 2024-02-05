package behavioral.templatemethod.version2;

/**
 * @author nisang
 * 2024/2/5 9:48
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class StudentB extends TestPaper {
    @Override
    protected String answer1() {
        return "d";
    }

    @Override
    protected String answer2() {
        return "b";
    }

    @Override
    protected String answer3() {
        return "a";
    }
}
