package 编程.Day03_1_做错了_没有用接口;

public class PTEmployee extends Employee {
    private double WorkTime;
    private double BasicSalary;

    public PTEmployee(){

    }

    public void setBasicSalary(double basicSalary) {
        BasicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setWorkTime(double workTime) {
        WorkTime = workTime;
    }

    public double getWorkTime() {
        return WorkTime;
    }

    @Override
    public double accountSalary(Company company, String name) {
        int len = company.getPTELen(company);
        double salary = 0;
        for (int i = 0; i<len;i++){
            if(company.getPtEmployees()[i].getName().equals(name)) {
                if (company.getPtEmployees()[i].getWorkTime()<196){
                    salary = company.getPtEmployees()[i].getBasicSalary();
                }else if (company.getPtEmployees()[i].getWorkTime()>196){
                    salary = company.getPtEmployees()[i].getBasicSalary() +
                            (company.getPtEmployees()[i].getWorkTime()-196)*200;
                }
            }
        }
        return salary;
    }
}
