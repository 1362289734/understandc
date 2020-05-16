package 编程.Day03_1_做错了_没有用接口;

public class Salesman extends Employee{
    private double saleMoney;
    private double basicSalary;

    public Salesman(){

    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setSaleMoney(double saleMoney) {
        this.saleMoney = saleMoney;
    }

    public double getSaleMoney() {
        return saleMoney;
    }

    @Override
    public double accountSalary(Company company, String name) {
        int lenSM = company.getSMLen(company);
        double sumSalary=0;
        for (int i = 0; i< lenSM;i++) {
            if (company.getSalesmen()[i].getName().equals(name)){
                if (company.getSalesmen()[i].getSaleMoney()<10000){
                    sumSalary = company.getSalesmen()[i].getSaleMoney()*0.1 + company.getSalesmen()[i].getBasicSalary();
                }else if(company.getSalesmen()[i].getSaleMoney()>=10000 && company.getSalesmen()[i].getSaleMoney()<100000){
                    sumSalary = company.getSalesmen()[i].getSaleMoney()*0.15 + company.getSalesmen()[i].getBasicSalary();
                }else if (company.getSalesmen()[i].getSaleMoney()>=100000){
                    sumSalary = company.getSalesmen()[i].getSaleMoney()*0.18 + company.getSalesmen()[i].getBasicSalary();
                }
            }
        }
        return sumSalary;
    }
}
