package 编程.Day03_1_做错了_没有用接口;

public class HourlyWorker extends Employee {
    private double workTime;
    private double salaryPerHour;

    public HourlyWorker(){

    }

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
    public double accountSalary(Company company, String name) {
        int len = company.getHWLen(company);
        double time, salaryPerHour, salary=0;
        for (int i = 0; i < len;i++) {
            if(company.getHourlyWorkers()[i].getName().equals(name)) {
                time = company.getHourlyWorkers()[i].getWorkTime();
                salaryPerHour = company.getHourlyWorkers()[i].getSalaryPerHour();
                salary = time * salaryPerHour;
            }
        }
        return salary;
    }

}
