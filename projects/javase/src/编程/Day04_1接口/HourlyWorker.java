package 编程.Day04_1接口;

public class HourlyWorker implements Employee {
    private String name;
    private double workTime;
    private double salaryPerHour;

    public HourlyWorker(){

    }

    public HourlyWorker(String name, double workTime, double salaryPerHour) {
        this.name = name;
        this.workTime = workTime;
        this.salaryPerHour = salaryPerHour;
    }

    public void setName(String name) { this.name = name; }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double getWorkTime() {
        return workTime;
    }

    @Override
    public double getSalary() {
        double salary;
        salary = workTime*salaryPerHour;
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }
}
