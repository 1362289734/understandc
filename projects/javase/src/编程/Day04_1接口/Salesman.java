package 编程.Day04_1接口;

public class Salesman implements Employee {
    private double saleMoney;
    private double basicSalary;
    private String name;

    public Salesman() {
    }

    public Salesman(String name,double saleMoney, double basicSalary) {
        this.saleMoney = saleMoney;
        this.basicSalary = basicSalary;
        this.name = name;
    }

    public void setSaleMoney(double saleMoney) {
        this.saleMoney = saleMoney;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaleMoney() {
        return saleMoney;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public double getSalary() {
        double salary=0;
        if (saleMoney<=10000){
            salary = basicSalary + saleMoney*0.1;
        }
        else if(saleMoney>10000 && saleMoney<= 100000){
            salary = basicSalary +saleMoney*0.15;
        }
        else if(saleMoney>100000){
            salary = basicSalary +saleMoney*0.18;
        }
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }
}
