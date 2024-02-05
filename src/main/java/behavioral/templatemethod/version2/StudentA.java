package behavioral.templatemethod.version2;

import behavioral.templatemethod.version2.TestPaper;

/**
 * @author nisang
 * 2024/2/5 9:48
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class StudentA extends TestPaper {
    @Override
    protected String answer1() {
        return "b";
    }

    @Override
    protected String answer2() {
        return "a";
    }

    @Override
    protected String answer3() {
        return "c";
    }
}
