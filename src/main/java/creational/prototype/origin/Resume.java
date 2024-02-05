package creational.prototype.origin;

/**
 * 简历类
 *
 * @author nisang  2024/2/4 20:02
 * @version 1.0  Ruoyi-Cloud-Plus开发小组
 */
public class Resume {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;


    public Resume(String name) {
        this.name = name;
    }

    /**
     * 设置个人信息
     *
     * @param sex the sex
     * @param age the age
     */
    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * Set work experience.
     *
     * @param timeArea the time area
     * @param company  the company
     */
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * Display.
     */
    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.println("工作经历 " + this.timeArea + " " + this.company);
    }

    public static void main(String[] args) {
        Resume resume1 = new Resume("大鸟");
        resume1.setPersonInfo("男", "29");
        resume1.setWorkExperience("1998-2000", "XXX公司");

        Resume resume2 = new Resume("大鸟");
        resume2.setPersonInfo("男", "29");
        resume2.setWorkExperience("1998-2000", "XXX公司");


        Resume resume3 = new Resume("大鸟");
        resume3.setPersonInfo("男", "29");
        resume3.setWorkExperience("1998-2000", "XXX公司");


        resume1.display();
        resume2.display();
        resume3.display();
    }
}
