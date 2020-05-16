package 编程.Day04_1接口;

public class Company {
    private Employee[] employee;
    private double sumSalary;

    public Company() {
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public double getSumSalary() {
        return sumSalary;
    }

    public void setSumSalary(double sumSalary) {
        this.sumSalary = sumSalary;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public void deleteEmployee(String name) {
        Employee[] employees = new Employee[employee.length -1];
        int i1=0;
        for (int i = 0; i<employee.length;i++,i1++){
            if (!employee[i].getName().equals(name)){
                employees[i1] = employee[i];
            }else {
                i1--;
            }
        }
        this.employee = employees;
    }

    public void showSalary(String name){
        for (int i=0;i<employee.length;i++) {
            if (this.employee[i].getName().equals(name)){
                System.out.println(name+"的工资为："+this.employee[i].getSalary());
            }else if (!this.employee[i].getName().equals(name)&&i == employee.length){
                System.out.println("员工不存在...");
            }
        }
    }

    public void showSumSalary(){
        double sumSalary=0;
        for (int i =0;i<employee.length;i++){
            setSumSalary(sumSalary+=employee[i].getSalary());
        }
        System.out.println("公司总工资为："+getSumSalary());
    }

    public void displayAllEmployee(){
        for (int i =0;i<employee.length;i++) {
            System.out.println(employee[i].getName()+"工资:"+employee[i].getSalary());
        }
    }

}
