package behavioral.templatemethod.version2;

/**
 * 试卷抽取
 *
 * @author nisang  2024/2/5 9:26
 * @version 1.0  Ruoyi-Cloud-Plus开发小组
 */
public abstract class TestPaper {
    /**
     * Answer 1 string.
     *
     * @return the string
     */
    protected abstract String answer1();

    /**
     * Test question 1.
     */
    public void testQuestion1() {
        System.out.println("杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是[]" + "a, 球磨铸铁b.马口铁c.高速合金钢d, 碳素纤维");
        System.out.println("答案："+this.answer1());
    }

    /**
     * Answer 2 string.
     *
     * @return the string
     */
    protected abstract String answer2();

    /**
     * Test question 2.
     */
    public void testQuestion2() {
        System.out.println("杨过、程英、陆无双铲除了情花，造成[]" + "a.使这种植物不再害人b.使一种珍稀物种灭绝c.破坏了那个生物圈的生态平衡d.造成该地区沙漠化");
        System.out.println("答案："+this.answer2());
    }

    /**
     * Answer 3 string.
     *
     * @return the string
     */
    protected abstract String answer3();

    /**
     * Test question 3.
     */
    public void testQuestion3() {
        System.out.println("蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药[】" + "a.阿司匹林b.牛黄解毒片c.氟哌酸d.让他们喝大量的生牛奶e.以上全不对");
        System.out.println("答案："+this.answer3());
    }
}