package 编程.Day04_1接口;

public class JewellerySalesman implements  Employee {
    private double sumOfProduction;
    private String name;

    public JewellerySalesman() {
    }

    public JewellerySalesman(double sumOfProduction, String name) {
        this.sumOfProduction = sumOfProduction;
        this.name = name;
    }

    public void setSumOfProduction(double sumOfProduction) {
        this.sumOfProduction = sumOfProduction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSumOfProduction() {
        return sumOfProduction;
    }

    @Override
    public double getSalary() {
        double salary=0;
        salary = sumOfProduction*50;
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }
}
