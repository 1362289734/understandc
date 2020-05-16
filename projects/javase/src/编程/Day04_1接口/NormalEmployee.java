package 编程.Day04_1接口;

public class NormalEmployee implements Employee {
    private String name;
    private double WorkTime;
    private double BasicSalary;

    public NormalEmployee() {
    }

    public NormalEmployee(String name, double workTime, double basicSalary) {
        this.name = name;
        WorkTime = workTime;
        BasicSalary = basicSalary;
    }

    public double getWorkTime() {
        return WorkTime;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkTime(double workTime) {
        WorkTime = workTime;
    }

    public void setBasicSalary(double basicSalary) {
        BasicSalary = basicSalary;
    }

    @Override
    public double getSalary() {
        double salary=0;
        if (WorkTime>196){
            salary = BasicSalary + (WorkTime-196)*200;
        }
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }
}
