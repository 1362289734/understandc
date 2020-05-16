package 继承.Day03_5;

public class Student extends Person{
    private String school;
    private String stuNumber;

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    @Override
    public void work() {
        System.out.println(super.getName()+" is studying.");
    }
}
