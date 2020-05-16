package 编程.Day04_1接口;

public class TEST {
    public static void main(String[] args) {
        Company company = new Company();
        Employee hourlyWorker1 = new HourlyWorker("张三",200,10);
        Employee hourlyWorker2 = new HourlyWorker("李四",230,20);
        Employee salesman1 = new Salesman("王五",5000,3000);
        Employee salesman2 = new Salesman("赵六",200000,3000);
        Employee normalEmployee = new NormalEmployee("孙七",205,2500);

        Employee [] employee = {hourlyWorker1,hourlyWorker2,salesman1,salesman2,normalEmployee};

        company.setEmployee(employee);
        company.displayAllEmployee();
        company.showSumSalary();

        System.out.println();

        Employee jewellerySalesman = new JewellerySalesman(30,"周八");
        Employee [] employee2 = {hourlyWorker1,hourlyWorker2,salesman1,salesman2,normalEmployee,jewellerySalesman};
        company.setEmployee(employee2);

        company.displayAllEmployee();
        company.showSumSalary();

        System.out.println();

        company.deleteEmployee("李四");
        company.showSalary("王五");
        System.out.println();

        company.displayAllEmployee();
        company.showSumSalary();

    }

}
