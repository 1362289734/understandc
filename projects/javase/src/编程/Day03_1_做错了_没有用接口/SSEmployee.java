package 编程.Day03_1_做错了_没有用接口;

public class SSEmployee extends Employee{
    private double sumOfProduction;

    public SSEmployee(){

    }

    public void setSumOfProduction(double sumOfProduction) {
        this.sumOfProduction = sumOfProduction;
    }

    public double getSumOfProduction() {
        return sumOfProduction;
    }

    @Override
    public double accountSalary(Company company, String name) {
        int len = company.getSSLen(company);
        double salary=0;
        for (int i = 0; i<len;i++) {
            if (company.getSsEmployees()[i].getName().equals(name)){
                salary = company.getSsEmployees()[i].getSumOfProduction()*50;
            }
        }
        return salary;
    }
}
