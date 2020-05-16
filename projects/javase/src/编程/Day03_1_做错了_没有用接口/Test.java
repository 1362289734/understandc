package 编程.Day03_1_做错了_没有用接口;

public class Test {
    public static void main(String[] args) {
//        Company com =  new Company();
//        com.addEmployee(com,"张三",456);
//        com.addEmployee(com,"李四",789);
//        com.addEmployee(com,"王五",123);
//        com.addEmployee(com,"赵六",678);
//        com.addEmployee(com,"孙七",147);
//        com.addEmployee(com,"周八",258);
//        com.display(com);
//
//
//        System.out.println();
//        System.out.println();
//        com.deleteEmployee(com,"王五");
//        com.display(com);
//        System.out.println();
//        com.showSalary(com,"周八");
//        System.out.println();
//        com.showSumSalary(com);


        Company company = new Company();
        company.addHourlyWorker(company,"张三",10,200);
        company.addHourlyWorker(company,"李四",10,230);

        company.addSalesMan(company,"王五",3000,5000);
        company.addSalesMan(company,"赵六",3000,200000);

        company.addPTEmployee(company,"孙七",3000,205);

        company.display(company);
        System.out.println();
        System.out.println();

        company.showSalary(company,"张三");
        company.showSalary(company,"李四");
        company.showSalary(company,"王五");
        company.showSalary(company,"赵六");
        company.showSalary(company,"孙七");

        System.out.println();
        company.showSumSalary(company);

        System.out.println();
        company.addSSEmployee(company,"周八",30);
        company.showSalary(company,"周八");
        System.out.println();

        company.display(company);
        company.showSumSalary(company);

        System.out.println();

        company.deleteEmployee(company,"王五");
        company.display(company);

    }
}
